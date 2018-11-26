package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;

public class Modelo {

	private HashMap<String, Juego> juegos;
	private final String FICHERO = "juegos.dat";

	public Modelo() throws ClassNotFoundException, IOException {
		if (new File(FICHERO).exists()) {
			cargarDeDisco();
		} else {
			juegos = new HashMap<String, Juego>();
		}
	}

	public void guardar(Juego juego) throws IOException {
		juegos.put(juego.getNombre(), juego);
		guardarADisco();
	}

	private void guardarADisco() throws IOException {

		ObjectOutputStream serealizador = new ObjectOutputStream(new FileOutputStream(FICHERO));
		serealizador.writeObject(juegos);
		serealizador.close();
	}

	private void cargarDeDisco() throws IOException, ClassNotFoundException {
		ObjectInputStream deserializador = new ObjectInputStream(new FileInputStream(FICHERO));
		juegos = (HashMap<String, Juego>) deserializador.readObject();
		deserializador.close();

	}

	public void eliminar(Juego juego) throws IOException {
		String nombre = juego.getNombre();
		juegos.remove(nombre);
		guardarADisco();
		
	}
	
	public void eliminarTodo() {
		//TODO falta rellenar
	}
	
	public void modificarJuego(String nombre, Juego juego) {
		
	}
	
	public Juego getJuego(String nombre) {
		return null;
	}
	
	public ArrayList<Juego> getJuegos(){
		return new ArrayList<Juego>(juegos.values());
	}
	
	
	

}
