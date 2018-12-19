package Ejercicio4;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JOptionPane;

public class Comprobar implements ActionListener {
	Vista vista = new Vista();

	public Comprobar() {
		addListeners();
		if(vista.list.equals("")) {
			System.out.println("vacio");
		}
	}

	private void addListeners() {
		vista.btnRegistrar.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {

		switch (arg0.getActionCommand()) {
		case "Registrar":

			if (vista.txNombre.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "El nombre es obligatorio", "error", JOptionPane.ERROR_MESSAGE);
				return;
			}
			if (vista.txPatrocinador.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "El patrocinador es obligatorio", "error",
						JOptionPane.ERROR_MESSAGE);
				return;
			}

		}
	}

	public static void main(String[] args) {
		Comprobar comprobar = new Comprobar();

	}
}
