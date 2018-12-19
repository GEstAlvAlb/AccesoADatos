package Ejercicio2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import javax.swing.JFileChooser;


public class Marca implements ActionListener {
	Vista vista;
	

	public Marca(Vista vista) {
		this.vista = vista;
		addListeners();
	

	}

	private void addListeners() {
		vista.btnGuardarComo.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		switch (arg0.getActionCommand()) {
		case "Guardar como":
			try {
				guardar();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	

	}


	public void guardar() throws IOException {
		JFileChooser jfc = new JFileChooser();
		if (jfc.showOpenDialog(null) == JFileChooser.CANCEL_OPTION)
			return;
		ObjectOutputStream serealizador = new ObjectOutputStream(new FileOutputStream(jfc.getSelectedFile()));
		serealizador.writeObject(vista.txTexto.getText());
		serealizador.close();
		
		
	}

}
