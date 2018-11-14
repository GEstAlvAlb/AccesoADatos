import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class esFichSe {

	public static void main(String[]args){
		try{
			BufferedWriter fe= new BufferedWriter(new FileWriter("Productos.txt",true)); //abre el fichero y hace un buffer para poder escribir cadenas
			
			for(int i=0;i<3;i++) {
				fe.write("producto"+i); //esto escribe en el fichero
				fe.newLine();	//crea una nueva linea
				
			}
			fe.close();
		
		}catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
		}
}
