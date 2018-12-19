package ejemplohibernate;

import org.hibernate.Session;

import ejemplohibernate.base.Personaje;

public class Aplicacion {
	
	public static void main(String args[]) {
	
		
		Vista vista=new Vista();
		Modelo modelo=new Modelo();
		Controlador controlador=new Controlador(modelo,vista);
		
	
	}
}
