package base;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import juego.VistaNuevo;
import juego.VistaPrograma;

public class Controlador implements ActionListener, MouseListener {

	private Modelo modelo;
	private VistaPrograma vista;
	private VistaNuevo vistaNuevo;
	private String nombreImagen;

	public Controlador(VistaPrograma vista, Modelo modelo) {
		this.vista = vista;
		this.modelo = modelo;
		

		addListeners();
		refrescarLista();
		modoEdicion(false);

	}

	private void modoEdicion(boolean activo) {
		if (activo) {
			// botones
			vista.btnEditar.setEnabled(false);
			vista.btnEliminar.setEnabled(false);
			vista.btnNuevo.setEnabled(true);

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
		// TODO la foto

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		
		
		Juego juego=new Juego();
		
		
		
		switch (e.getActionCommand()) {
		case "nuevo":
			modoEdicion(true);
			VistaNuevo vistaNueva= new VistaNuevo();
			
			//vista.lJuegos.removeMouseListener(this);
			
			break;
		case "editar":
			// TODO editar en la otra ventana
			break;
		case "eliminar":

			juego=vista.lJuegos.getSelectedValue();
			modelo.eliminar(juego);
			refrescarLista();
			
			break;
		default:
			break;

		}

	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub

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
