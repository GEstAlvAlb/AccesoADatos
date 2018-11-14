import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class leerFichSe {
	public static void main(String[]args){
		try{
			BufferedReader fr= new BufferedReader(new FileReader("Productos.txt")); //abre el fichero y hace un buffer para poder escribir cadenas
			while(fr.ready()) {
				String linea=fr.readLine();
				System.out.println(linea);
			}
			fr.close();
		
		}catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
		}
}
