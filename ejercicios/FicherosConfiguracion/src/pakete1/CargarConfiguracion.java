package pakete1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class CargarConfiguracion {

	public static void main(String[]args) {
		Properties configuracion = new Properties();
		try {
			configuracion.load(new FileInputStream(System.getProperty("user.home")+ File.separator+"confiruracion.props"));
			boolean subtitulos=Boolean.parseBoolean(configuracion.getProperty("subtitulos"));
			if (subtitulos) {
				System.out.println("hay que poner subtitulos");
			}
		}catch(FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}
}
