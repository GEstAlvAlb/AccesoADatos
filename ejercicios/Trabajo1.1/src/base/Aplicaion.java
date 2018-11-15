package base;

import juego.VistaPrograma;

public class Aplicaion {

	public static void main(String[] args) {

		VistaPrograma vista = new VistaPrograma();

		Modelo modelo = new Modelo();
		Controlador controladro = new Controlador(vista, modelo);

	}
}
