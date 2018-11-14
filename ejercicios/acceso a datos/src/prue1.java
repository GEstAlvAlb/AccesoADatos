import java.util.*;
public class prue1 {
	
	
	public static void main(String[] args){
		//array list
		ArrayList lista = new ArrayList(); //
		//ArrayList<tipo> lista=new ArrayList() es otra forma de declar lo mismo
		
		
		persona a = new persona("Maria");
		persona b =new persona("Pepe");
		persona c =new persona("Sara");
		
		lista.add(a);
		lista.add(b);
		lista.add(c);
		
		Iterator it = lista.iterator(); 
		
		while(it.hasNext()) {
			System.out.println(it.next()); //no ordena y permite que haya duplicados
		}
		System.out.println(lista.get(0)); //muestra el valor en la posicion 
		//modifica el valor de una posicion y corre todo un puesto
		persona d=new persona("xxxxxxx"); 
		lista.add(1,d);
		System.out.println(lista.get(1));
		
		//borrar
		//lista.remove(2); //borra la posicon
		//lista.remove(a); //borra por valor
		
		//encuentra el valor a buscar
		int pos = lista.indexOf(b);
		System.out.println(pos); //sino existe muestra -1
		
		
		
		//hastmap
		/*Map<String,persona>m=new HashMap();
		
		//utilizamos los valores anteriores
		
		//introducion de datos el primer valor es la clave el sefundo el valor
		m.put("01", a);
		m.put("02", b);
		m.put("03", c);
		//mostrar datos
		Iterator it1= m.keySet().iterator(); //el m.keySet() devuelve la clave
		
		while (it1.hasNext()) {
			String clave=(String)it1.next(); //guarda la clave
			Object valor=(Object)m.get(clave); //esto muestrta lo que se encuentra dentro de la clave
			System.out.println(clave +" "+ valor);
		}
		
		
		*/
	}
	
	
	/*public static void buscarDuplicado(Collection coleccion, Object objeto){
       Iterator it = coleccion.iterator();
       int cont=0;
       ArrayList lista = new ArrayList(coleccion);
       
        while ((it.hasNext())&& cont<=2 ){
            if (objeto==lista.get(it.next())){
        		cont=cont+1;
        }
            }
    }*/
}