package pakete2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;

public class SerializarObjeto {
	public static void main(String args[]) {
		HashMap<String,Producto> listaProductos=new HashMap<>();
		
		listaProductos.put("manzanas",new Producto());
		listaProductos.put("platanos",new Producto());
		listaProductos.put("teclado",new Producto());
		
		
		ObjectOutputStream serializador=null;
		try {
			
		
			serializador= new ObjectOutputStream(new FileOutputStream("productos.dat"));
			serializador.writeObject(listaProductos);
			
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}finally {
			if(serializador !=null) {
				try {
					serializador.close();
				}catch(IOException ioe) {
					ioe.printStackTrace();
				}
			}
		}
	}
}
