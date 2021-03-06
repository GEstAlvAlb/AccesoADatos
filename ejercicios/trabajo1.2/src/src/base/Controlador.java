package src.base;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import src.juego.VistaLogin;
import src.juego.VistaNuevo;
import src.juego.VistaPrograma;

public class Controlador implements ActionListener, MouseListener, DocumentListener {

	private Modelo modelo;
	private VistaPrograma vista;
	private VistaNuevo vistaNuevo;
	private File ficheroSeleccionado;

	public Controlador(VistaPrograma vista, Modelo modelo, VistaNuevo vistaNuevo) throws SQLException {
		this.vista = vista;
		this.modelo = modelo;
		this.vistaNuevo = vistaNuevo;

		addListeners();
		iniciarSesion();
		refrescarLista();
		modoEdicion(false);

	}

	private void iniciarSesion() {
		boolean autenticado = false;

		VistaLogin login = new VistaLogin();
		int intentos = 1;

		do {
			login.mostrarDialogo();
			String usuario = login.getUsuario();
			String contrasena = login.getContrasena();

			try {
				autenticado = modelo.iniciarSesion(usuario, contrasena);
				if (!autenticado) {
					if (intentos > 2) {
						JOptionPane.showMessageDialog(null, "Limite superado", "Error", JOptionPane.ERROR_MESSAGE);
						System.exit(0);
					}
					login.limpiarContrasena();
					login.setMensaje("Usuario/Contraseņa incorrectos");
					intentos++;
				}
				JOptionPane.showMessageDialog(null, "has iniciado sesion", "Error", JOptionPane.ERROR_MESSAGE);
			} catch (SQLException sqle) {
				JOptionPane.showMessageDialog(null, "no se ha podido concectar", "Error", JOptionPane.ERROR_MESSAGE);
			}
		} while (!autenticado);
	}

	private void modoEdicion(boolean activo) {
		if (activo) {
			// botones
			vista.btnEditar.setEnabled(false);
			vista.btnEliminar.setEnabled(false);
			vista.btnNuevo.setEnabled(false);
			vista.btnBorrarTodo.setEnabled(false);

		} else {
			vista.btnEditar.setEnabled(true);
			vista.btnEliminar.setEnabled(true);
			vista.btnNuevo.setEnabled(true);
			vista.btnBorrarTodo.setEnabled(true);

		}

	}

	private void refrescarLista() throws SQLException {

		vista.mJuegos.removeAllElements();
		for (Juego juego : modelo.getJuegos()) {
			vista.mJuegos.addElement(juego);
		}
	}

	private void addListeners() {
		vista.btnNuevo.addActionListener(this);
		vista.btnEditar.addActionListener(this);
		vista.btnEliminar.addActionListener(this);
		vista.lJuegos.addMouseListener(this);
		vistaNuevo.btGuardar.addActionListener(this);
		vistaNuevo.btCancelar.addActionListener(this);
		vista.btnBorrarTodo.addActionListener(this);
		vistaNuevo.lblmagen.addMouseListener(this);
		vista.txBuscar.getDocument().addDocumentListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		Juego juego = new Juego();

		switch (e.getActionCommand()) {
		case "Nuevo":
			limpiar();
			modoEdicion(true);
			vistaNuevo.setSize(450, 350);
			vistaNuevo.setVisible(true);

			vista.lJuegos.removeMouseListener(this);

			break;
		case "Editar":
			modoEdicion(true);
			vistaNuevo.setSize(450, 350);
			vistaNuevo.setVisible(true);
			break;
		case "Eliminar":

			if (vista.lJuegos.getSelectedValue() == null) {

			} else {
				juego = vista.lJuegos.getSelectedValue();
				try {
					modelo.eliminar(juego);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					refrescarLista();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			break;
		case "Guardar":

			if (vistaNuevo.tfNombre.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "El nombre es obligatorio", "Error", JOptionPane.ERROR_MESSAGE);
				vistaNuevo.tfNombre.selectAll();
				vistaNuevo.tfNombre.requestFocus();
				return;
			}
			if (vistaNuevo.tfCopias.getText().equals("")) {
				vistaNuevo.tfCopias.setText("0");
			}
			if (!vistaNuevo.tfCopias.getText().matches("[0-9]*")) {
				JOptionPane.showMessageDialog(null, "En copias solo se atmiten dijitos", "error",
						JOptionPane.ERROR_MESSAGE);
				vistaNuevo.tfCopias.selectAll();
				vistaNuevo.tfCopias.requestFocus();
				return;
			}
			if (vistaNuevo.tfDuracion.getText().equals("")) {
				vistaNuevo.tfDuracion.setText("0");
			}
			if (!vistaNuevo.tfDuracion.getText().matches("[0-9]*")) {
				JOptionPane.showMessageDialog(null, "En duracion solo se atmiten dijitos", "error",
						JOptionPane.ERROR_MESSAGE);
				vistaNuevo.tfDuracion.selectAll();
				vistaNuevo.tfDuracion.requestFocus();
				return;
			}
			if (vistaNuevo.tfValoracion.getText().equals("")) {
				vistaNuevo.tfValoracion.setText("0");
			}
			if (vistaNuevo.tfPrecio.getText().equals("")) {
				vistaNuevo.tfPrecio.setText("0");
			}

			String nombre = vistaNuevo.tfNombre.getText();
			int copias = Integer.parseInt(vistaNuevo.tfCopias.getText());
			int valoracion = Integer.parseInt(vistaNuevo.tfValoracion.getText());
			float precio = Float.parseFloat(vistaNuevo.tfPrecio.getText());
			int duracion = Integer.parseInt(vistaNuevo.tfDuracion.getText());

			String nombreImagen = null;
			Juego juegos = new Juego();

			if (ficheroSeleccionado != null)
				nombreImagen = ficheroSeleccionado.getName();
			else
				nombreImagen = "nopicture.png";

			if (ficheroSeleccionado.exists()) {
				juegos.setImagen(nombreImagen);
			} else {
				juegos.setImagen("");
			}

			juegos.setNombre(nombre);
			juegos.setCopias(copias);
			juegos.setValoracion(valoracion);
			juegos.setPrecio(precio);
			juegos.setDuracio(duracion);

			vista.lJuegos.addMouseListener(this);

			try {
				Util.copiarImagen(ficheroSeleccionado.getAbsolutePath(), nombreImagen);
				modelo.guardar(juegos);
			} catch (IOException ioe) {
				JOptionPane.showMessageDialog(null, "error al guardar", "Error", JOptionPane.ERROR_MESSAGE);
				ioe.printStackTrace();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			limpiar();
			break;
		case "Cancelar":
			limpiar();
			try {
				refrescarLista();
			} catch (SQLException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			vistaNuevo.setVisible(false);
			modoEdicion(false);
			break;
		case "Buscar":

			modoEdicion(true);
			vistaNuevo.setSize(450, 350);
			vistaNuevo.setVisible(true);
			break;

		case "Borrar todo":
			try {
				modelo.eliminarTodo();
			} catch (IOException e1) {

				e1.printStackTrace();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				refrescarLista();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			break;

		default:
			break;

		}

	}

	private void limpiar() {
		vistaNuevo.tfNombre.setText("");
		vistaNuevo.tfCopias.setText("");
		vistaNuevo.tfDuracion.setText("");
		vistaNuevo.tfValoracion.setText("");
		vistaNuevo.tfPrecio.setText("");
		vistaNuevo.lblmagen.setText("");

	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		if (arg0.getSource() == vistaNuevo.lblmagen) {
			JFileChooser jfc = new JFileChooser();
			if (jfc.showSaveDialog(null) == JFileChooser.CANCEL_OPTION)
				return;
			ficheroSeleccionado = jfc.getSelectedFile();
			vistaNuevo.lblmagen.setIcon(new ImageIcon(ficheroSeleccionado.getAbsolutePath()));
		} else if (arg0.getSource() == vista.lJuegos) {
			Juego juego = vista.lJuegos.getSelectedValue();
			String nombre = juego.getNombre();
			int copias = juego.getCopias();
			int duracion = juego.getDuracio();
			int valoracion = juego.getValoracion();
			float precio = juego.getPrecio();
			String nombreImagen = juego.getImagen();

			vistaNuevo.tfNombre.setText(nombre);
			vistaNuevo.tfCopias.setText(String.valueOf(copias));
			vistaNuevo.tfDuracion.setText(String.valueOf(duracion));
			vistaNuevo.tfValoracion.setText(String.valueOf(valoracion));
			vistaNuevo.tfPrecio.setText(String.valueOf(precio));
			vista.lblNombre.setText(nombre);
			vista.lbCopias.setText(String.valueOf(copias));
			vista.lblDuracion.setText(String.valueOf(duracion));
			vista.lblValoracion.setText(String.valueOf(valoracion));
			vista.lblPrecio.setText(String.valueOf(precio));

			vistaNuevo.lblmagen.setIcon(new ImageIcon("Imagenes" + File.separator + nombreImagen));
		}

	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void changedUpdate(DocumentEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void insertUpdate(DocumentEvent arg0) {

		vista.mJuegos.removeAllElements();
		try {
			for (Juego juego : modelo.getJuegos(vista.txBuscar.getText())) {
				vista.mJuegos.addElement(juego);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void removeUpdate(DocumentEvent arg0) {
		vista.mJuegos.removeAllElements();
		try {
			for (Juego juego : modelo.getJuegos(vista.txBuscar.getText())) {
				vista.mJuegos.addElement(juego);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
