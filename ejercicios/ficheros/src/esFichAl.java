import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.util.Random;

/*fichero aleatorio que pediremos por teclado nombres y notas
*/
public class esFichAl {
	public static void main(String[] args) {
		try {
			BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
			RandomAccessFile fe = new RandomAccessFile("notas.txt", "rw"); // abre el fichero en modo lectura escritura
			for (int i = 0; i < 4; i++) {
				System.out.println("INtroduce nombre");
				fe.writeUTF(convertUTF(teclado.readLine(), 20));
				System.out.println("introduce nota");
				fe.writeDouble(new Double(teclado.readLine()).doubleValue());
			}
			fe.close();
			teclado.close();
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