import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Fichero{

	static final String ruta = "C:\\Users\\Alumnot\\Desktop\\2\\Acceso a datos\\saludo.txt";

	public static void main(String[] args) throws Exception{
		FileReader fr = new FileReader(ruta);
		BufferedReader br = new BufferedReader(fr);
		String linea;

		while((linea = br.readLine()) != null){
			System.out.println(linea);
		}
		fr.close();
	}
}