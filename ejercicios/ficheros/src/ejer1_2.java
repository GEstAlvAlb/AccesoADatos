import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Iterator;

/*
 *Tenemos un arry list con nombres de cantatnes minimo 5 deberemos recorrer el arry para escribir en un fichero aleatorio dichos nombres una vez escritos dicos datos
 *mostraremos el primero y el ultimo de esos datos
 *
 *
 *tenemos una coleccion con una serie de numeros enteros debemos volcar esos numeros en un fichero y recorrer desde el primero hasyta el ulitmo indicando sin son pares
 *o impares 
 *
 */
public class ejer1_2 {

	public static void main(String[] args) {

		/*
		 * ArrayList<String> aList = new ArrayList();
		 * 
		 * aList.add("Ramoncin"); aList.add("Hana Montana"); aList.add("Marisol");
		 * aList.add("los chunguitos"); aList.add("luis miguel");
		 * aList.add("space girls"); aList.add("lola flores"); String val=" ";
		 * 
		 * try {
		 * 
		 * RandomAccessFile fe = new RandomAccessFile("autores.txt", "rw"); // abre el
		 * fichero en modo lectura escritura
		 * 
		 * Iterator it=aList.iterator(); while(it.hasNext()) {
		 * fe.writeUTF(convertUTF(it.next().toString(), 28)); }
		 * 
		 * fe.close();
		 * 
		 * 
		 * RandomAccessFile fl = new RandomAccessFile("autores.txt", "rw"); fl.seek(0);
		 * String res = fl.readUTF(); System.out.println(res); fl.seek(fl.length()-30);
		 * res = fl.readUTF(); System.out.println(res);
		 * 
		 * } catch (IOException ioe) { ioe.printStackTrace(); }
		 * 
		 * 
		 * 
		 * }
		 */

		int aNum[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 15, 32 };

		try {
			BufferedWriter fe = new BufferedWriter(new FileWriter("num.txt", true));

			for (int i = 0; i >= aNum.length; i++) {

				fe.write(aNum[i]);
				fe.newLine();
			}

			fe.close();
			
			BufferedReader fr =new
			
		} catch (IOException ioe) {

			ioe.printStackTrace();
		}
	}

	static String convertUTF(String txt, int largo) {
		String s = txt;
		// Trunca el string si es más grande siempre será 30 si es más sólo mostrará 30
		if (s.length() > largo) //
			return s.substring(0, largo);
		// Rellena con espacios si le faltan
		for (int n = s.length(); n < largo; n++)
			s = s + " ";
		return s;
	}
}
