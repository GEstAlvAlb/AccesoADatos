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
		if (nombre.equals(" ")) {
			
		} else {
			juegos.remove(nombre);
			guardarADisco();
		}
	}

	public void eliminarTodo() throws IOException {
		juegos.clear();
		guardarADisco();
	}

	public void modificarJuego(String nombre, Juego juego) {

	}

	public ArrayList<Juego> getJuegos(String nombre) {

		ArrayList<Juego> juegosBuscar = new ArrayList<>();
		for (Juego juego : juegos.values()) {
			if (juego.getNombre().contains(nombre)) {
				juegosBuscar.add(juego);
			}
		}

		return juegosBuscar;
	}

	public ArrayList<Juego> getJuegos() {

		return new ArrayList<Juego>(juegos.values());
	}

}
