import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class token {
	public static void main(String[]args) {
		try {
		BufferedReader fr= new BufferedReader(new FileReader("persona.txt"));
		String linea=" ";
		while((linea=fr.readLine())!=null) {
			StringTokenizer it = new StringTokenizer(linea,",");
			
			while(it.hasMoreTokens()) {
				String id= it.nextToken();
				String nombre=it.nextToken();
				System.out.print(id+" "+nombre);
			}
		}
		
		
		
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}
}
