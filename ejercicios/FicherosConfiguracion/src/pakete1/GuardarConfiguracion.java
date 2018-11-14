package pakete1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GuardarConfiguracion {

	public static void main(String[]args) {
		
		//crear el fichero de configuracion
		Properties configuracion=new Properties();
		configuracion.setProperty("reproducion_continua",String.valueOf(true));
		configuracion.setProperty("pantalla_bienvenida", String.valueOf(false));
		configuracion.setProperty("subtitulos", String.valueOf(true));
		configuracion.setProperty("idioma", "spanis");
		try {										//esto es para saber la ruta del usuario
			configuracion.store(new FileOutputStream(System.getProperty("user.home")+ File.separator+"confiruracion.props"), "Configuracion del programa"); //esto lo introduce al fichero
		}catch(FileNotFoundException fnfe) {											//para la ruta
			fnfe.printStackTrace();
		}catch (IOException ioe) {
			ioe.printStackTrace();
		}
		
	}
}
