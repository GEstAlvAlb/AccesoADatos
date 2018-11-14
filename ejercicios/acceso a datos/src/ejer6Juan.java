import java.util.*;
public class ejer6Juan {
	public static void main(String[] args)
	{
		HashMap<String,Empleado> hm = new HashMap();
		
		hm.put("34806408V", new Empleado("Pedro", "Martínez"));
		hm.put("34186581A", new Empleado("Pablo", "Fernández"));
		
		Ejercicio3.mostrarHm(hm);
		
		if(hm.containsKey("34186581A"))
		{
			hm.remove("34186581A");
		}
		else
		{
			System.out.println("No existe la persona con ese dni que intenta borrar");
		}
		
		Ejercicio3.mostrarHm(hm);
	}
}
