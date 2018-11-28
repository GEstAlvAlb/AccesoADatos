package src.base;

import java.io.IOException;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import src.juego.VistaNuevo;
import src.juego.VistaPrograma;

public class Aplicaion {

	public static void main(String[] args) {

		VistaPrograma vista = new VistaPrograma();
		VistaNuevo vistaNuevo=new VistaNuevo(); 

		
		Modelo modelo = new Modelo();
		try {
			Controlador controlador=new Controlador(vista,modelo,vistaNuevo);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
