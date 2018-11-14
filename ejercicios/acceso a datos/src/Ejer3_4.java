import java.util.*;

public class Ejer3_4 {

	public static void main(String[] args){
	Map<String,String>m= new HashMap();
	String aPer[]= {"Tio","Suegro","Abogado"};
	int cont=0;
	boolean enc=false;
	
	m.put("Doctor", "+(52)4000-5000");
	m.put("Casa", "+(888)4500-3400");
	m.put("Hermano", "+(575)2042-3233");
	m.put("Tio", "+(421)1010-0020");
	m.put("Suegros", "+(334)6105-4334");
	m.put("Oficina", "+(52)4000-5000");
	m.put("Abogado", "+(52)4000-5000");
	m.put("Papa", "+(52)4000-5000");
	m.put("Tienda", "+(52)4000-5000");
	
	 mostrarContenido(m);
	 Iterator it = m.keySet().iterator();
	 
	 while (it.hasNext()) {
			String clave=(String)it.next(); 
			Object valor=(Object)m.get(clave); 
			cont=0;
			while(cont<=3 || enc==true) {
				if(valor==aPer[cont]) {
					
				}
			}
		}
	
	}
	
	public static void mostrarContenido(Map mapa){
        Iterator it = mapa.keySet().iterator(); //llama a la clave primaria

    	while (it.hasNext()) {
			String clave=(String)it.next(); //guarda la clave
			Object valor=(Object)mapa.get(clave); //esto muestrta lo que se encuentra dentro de la clave
			System.out.println(clave +" "+ valor);
		}
    }
	
}
