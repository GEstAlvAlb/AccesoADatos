
public class Main {

	public static void main(String[] srtg) {
		Vista aplicacion=new Vista();
		Modelo modelo=new Modelo();
		Controlador controlador=new Controlador(modelo, aplicacion);
	}
}
