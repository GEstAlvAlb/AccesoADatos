
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class coreccion1 {
	
	public static String convertUTF (String txt, int largo) {
		String s = txt;
		// Trunca el string si es más grande siempre será 30 si es más sólo mostrará 30
		if (s.length() > largo)  //
			return s.substring(0, largo);
		// Rellena con espacios si le faltan
		for (int n=s.length(); n<largo; n++)
			s=s +" ";
		return s;

	}
	public static void main (String args []) throws FileNotFoundException
	{
		ArrayList<String> lista= new ArrayList();
		lista.add("Adele");
		lista.add("Papa Roach");
		lista.add("Bon Jovi");
		lista.add("Ayax");
		lista.add("Prox ");
	

				try {
				RandomAccessFile fe=new RandomAccessFile("artistas.txt","rw");
				Iterator it= lista.iterator();
				while(it.hasNext())
				{
					fe.writeUTF(convertUTF( (String)(it.next()),20));
				}
					
				fe.close();
				}catch(Exception e) {}
	try {
		RandomAccessFile fl=new RandomAccessFile("artistas.txt","rw");
		fl.seek(22*0);
		String res=fl.readUTF();
		System.out.println(res);
		
		fl.seek(22*4);
		res=fl.readUTF();
		System.out.println(res);
		}
		catch(Exception e) {}			
	
	}

		}
	

