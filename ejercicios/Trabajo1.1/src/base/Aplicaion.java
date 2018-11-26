package base;

import java.io.IOException;

import javax.swing.JOptionPane;

import juego.VistaNuevo;
import juego.VistaPrograma;

public class Aplicaion {

	public static void main(String[] args){

		VistaPrograma vista = new VistaPrograma();
		VistaNuevo vistaNuevo=new VistaNuevo();

		
		try {
			Modelo modelo = new Modelo();
			Controlador controlador=new Controlador(vista,modelo,vistaNuevo);
		} catch (ClassNotFoundException e) {
			JOptionPane.showMessageDialog(null, "no se puede leer de disco", "eror", JOptionPane.ERROR_MESSAGE);
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "El formato de los datos no es el correcto","error",
					JOptionPane.ERROR_MESSAGE);
			System.exit(1);
		}
	}
}
