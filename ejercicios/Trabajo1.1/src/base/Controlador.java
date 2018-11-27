package base;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import juego.VistaNuevo;
import juego.VistaPrograma;

public class Controlador implements ActionListener, MouseListener {

	private Modelo modelo;
	private VistaPrograma vista;
	private VistaNuevo vistaNuevo;
	private String nombreImagen;
	
	
	public Controlador(VistaPrograma vista, Modelo modelo,VistaNuevo vistaNuevo) {
		this.vista = vista;
		this.modelo = modelo;
		this.vistaNuevo=vistaNuevo;
		

		addListeners();
		refrescarLista();
		modoEdicion(false);

	}

	private void modoEdicion(boolean activo) {
		if (activo) {
			// botones
			vista.btnEditar.setEnabled(false);
			vista.btnEliminar.setEnabled(false);
			vista.btnNuevo.setEnabled(false);

		} else {
			vista.btnEditar.setEnabled(true);
			vista.btnEliminar.setEnabled(true);
			vista.btnNuevo.setEnabled(true);
		}

	}

	private void refrescarLista() {

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
		// TODO la foto

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		
		
		Juego juego=new Juego();
		
		
		
		switch (e.getActionCommand()) {
		case "Nuevo":
			limpiar();
			modoEdicion(true);
			vistaNuevo.setSize(450,350);
			vistaNuevo.setVisible(true);
			
			
			vista.lJuegos.removeMouseListener(this);
			
			break;
		case "Editar":
			modoEdicion(true);
			vistaNuevo.setSize(450,350);
			vistaNuevo.setVisible(true);
			break;
		case "Eliminar":

			juego=vista.lJuegos.getSelectedValue();
			try {
				modelo.eliminar(juego);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			refrescarLista();
			
			break;
		case "Guardar":
			
			if(vistaNuevo.tfNombre.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "El nombre es obligatorio","Error" , JOptionPane.ERROR_MESSAGE);
				vistaNuevo.tfNombre.selectAll();
				vistaNuevo.tfNombre.requestFocus();
				return;
			}
			if(vistaNuevo.tfCopias.getText().equals("")) {
				vistaNuevo.tfCopias.setText("0");
			}
			if(!vistaNuevo.tfCopias.getText().matches("[0-9]*")) {
				JOptionPane.showMessageDialog(null, "En copias solo se atmiten dijitos", "error",	 JOptionPane.ERROR_MESSAGE);
				vistaNuevo.tfCopias.selectAll();
				vistaNuevo.tfCopias.requestFocus();
				return;
			}
			if(vistaNuevo.tfDuracion.getText().equals("")) {
				vistaNuevo.tfDuracion.setText("0");
			}
			if(!vistaNuevo.tfDuracion.getText().matches("[0-9]*")) {
				JOptionPane.showMessageDialog(null, "En duracion solo se atmiten dijitos", "error", JOptionPane.ERROR_MESSAGE);
				vistaNuevo.tfDuracion.selectAll();
				vistaNuevo.tfDuracion.requestFocus();
				return;
			}
			if(vistaNuevo.tfValoracion.getText().equals("")) {
				vistaNuevo.tfValoracion.setText("0");
			}
			if(vistaNuevo.tfPrecio.getText().equals("")) {
				vistaNuevo.tfPrecio.setText("0");
			}
			
			
			String nombre=vistaNuevo.tfNombre.getText();
			int copias=Integer.parseInt(vistaNuevo.tfCopias.getText());
			int valoracion=Integer.parseInt(vistaNuevo.tfValoracion.getText());
			float precio=Integer.parseInt(vistaNuevo.tfPrecio.getText());
			int duracion=Integer.parseInt(vistaNuevo.tfDuracion.getText());
			
			Juego juegos=new Juego();
			juegos.setNombre(nombre);
			juegos.setCopias(copias);
			juegos.setValoracion(valoracion);
			juegos.setPrecio(precio);
			juegos.setDuracio(duracion);
			
			vista.lJuegos.addMouseListener(this);
			try {
				modelo.guardar(juegos);
			}catch(IOException ioe) {
				JOptionPane.showMessageDialog(null, "error al guardar", "Error", JOptionPane.ERROR_MESSAGE);
			}
			limpiar();
			break;
		case "Cancelar":
			limpiar();
			refrescarLista();
			vistaNuevo.setVisible(false);
			modoEdicion(false);
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
		
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		if(arg0.getSource()==vistaNuevo.lblmagen) {
			JFileChooser jfc =new JFileChooser();
			if(jfc.showSaveDialog(null)==JFileChooser.CANCEL_OPTION)
				return;
			File fichero=jfc.getSelectedFile();
			vistaNuevo.lblmagen.setIcon(new ImageIcon(fichero.getAbsolutePath()));
			nombreImagen=fichero.getName();
		}else if(arg0.getSource()==vista.lJuegos) {
			Juego juego=vista.lJuegos.getSelectedValue();
			String nombre=juego.getNombre();
			int copias=juego.getCopias();
			int duracion=juego.getDuracio();
			int valoracion=juego.getValoracion();
			float precio = juego.getPrecio();
			
			vistaNuevo.tfNombre.setText(nombre);
			vistaNuevo.tfCopias.setText(String.valueOf(copias));
			vistaNuevo.tfDuracion.setText(String.valueOf(duracion));
			vistaNuevo.tfValoracion.setText(String.valueOf(valoracion));
			vistaNuevo.tfPrecio.setText(String.valueOf(precio));
			
			
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

}
