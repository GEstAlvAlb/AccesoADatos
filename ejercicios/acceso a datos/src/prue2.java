import java.io.*;
import java.util.*;

public class prue2 {
//crea un array list de string que van a contener paises minimo 5 queremos añadir un
//nuevo elemento en la posicion 1 que sera italia, leer por teclado el nombre del pais a borrar
//si esta en el array list se borra sino un mensaje de error, mostrar todo el contenido LO PRIMERO, mostrar el primer y el 
//tercer pais
	public static void main(String[]args) {
	ArrayList<String>paises= new ArrayList();
	
		paises.add("España");
		paises.add("Rusia");
		paises.add("EEUU");
		paises.add("URS");
		paises.add("Canada");
		
		Iterator it=paises.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		paises.add(1,"italia");
		
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		
		
	}
	
}

