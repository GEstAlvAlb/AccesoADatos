import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;


public class correccion2 {


    public correccion2(){
    }

    public void ejercicio2(ArrayList<Integer> lista){
        File fichero;
        fichero = volcarNumeros(lista);
        parImpar(fichero);
    }

    private File volcarNumeros(ArrayList<Integer> lista){
        BufferedWriter writer;
        Iterator it;
        File salida = new File("numeros.txt");

        try{
            writer = new BufferedWriter(new FileWriter(salida));
            it = lista.iterator();
            while (it.hasNext()){
                writer.write(it.next().toString());
                writer.newLine();
            }
            writer.close();
        }
        catch (IOException ioe){
            ioe.printStackTrace();
        }

        return salida;
    }

    private void parImpar(File entrada){
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(entrada));
            while (reader.ready()){
                String linea = reader.readLine();
                System.out.println(linea + ": " + (Integer.parseInt(linea)%2==0?"Par":"Impar")); // importantte el ?parte si : parte no
            }
            reader.close();
        }
        catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
