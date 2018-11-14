package Colecciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Main2 {
    public static void main(String[] args){
        String[] paises = {"España", "Francia", "Alemania", "Irlanda", "Portugal"};
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

        // ArrayList que contenga los paises
        ArrayList<String> lista = new ArrayList<>();
        for(String pais: paises){
            lista.add(pais);
        }

        // Intercalar italia en la posicion 1
        lista.add(1, "Italia");

        // Leer el nombre del pais a borrar
        try {
            System.out.println("Introduce el país que quieres borrar:");
            String pais = teclado.readLine();
            if (lista.contains(pais))
                lista.remove(pais);
            else
                System.out.println(pais + " no pertenece a la lista");
        } catch (IOException e){
            e.printStackTrace();
        }

        // Mostrar el contenido
        System.out.println("\nCONTENIDO DE LA LISTA: ");
        mostrarContenido(lista);
        System.out.println();

        // Mostrar el primer y tercer pais
        System.out.println("Primer país: " + lista.get(0));
        System.out.println("Tercer país: " + lista.get(2));
    }

    public static void mostrarContenido(Collection coleccion){
        Iterator it = coleccion.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
