import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class leerFichAl {
	public static void main(String[] args) {
		try {
			BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
			Scanner reader = new Scanner(System. in);
			RandomAccessFile fl = new RandomAccessFile("notas.txt", "rw"); // abre el fichero en modo lectura escritura
			System.out.println("fila");
			int i= reader.nextInt();
			i=i-1;
			
			fl.seek(30*i);
			String res = fl.readUTF() + " " + fl.readDouble();
			System.out.print(res);

			fl.close();
			teclado.close();
			reader.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}

}