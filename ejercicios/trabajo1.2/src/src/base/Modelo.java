package src.base;

import java.io.File;
import java.sql.Connection;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

public class Modelo {

	private static final String FICHERO_CONFIGURACION = "configuracion.props";
	private Connection conexion;

	public void conectar() throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {
		Properties configuracion = new Properties();

		configuracion.load(new FileInputStream("configuracion.prop"));
		String IP = configuracion.getProperty("server");
		String BASE_DATOS = configuracion.getProperty("user");
		String USUARIO = configuracion.getProperty("user");
		String CONTRASENA = configuracion.getProperty("password");

		Class.forName("com.mysql.cj.jdbc.Driver");
		conexion = DriverManager.getConnection("jdbc:mysql;//" + IP + "/" + BASE_DATOS, USUARIO, CONTRASENA);
	}

	public void desconectar() throws SQLException {
		conexion.close();
	}

	public boolean iniciarSesion(String usuario, String contrasena) throws SQLException {

		String sql = "SELECT id FROM usuario WHERE usuario= ?" + "AND contrasena=SHA1(?)";
		PreparedStatement sentencia = conexion.prepareStatement(sql);
		sentencia.setString(1, usuario);
		sentencia.setString(2, contrasena);

		ResultSet resultado = sentencia.executeQuery();
		if (!resultado.next())
			return false;
		return true;
	}

	public void guardar(Juego juego) throws SQLException {
		String sql = "INSERT INTO juegos(nombre,imagen,copias,precio,valoracion,duracion)" + "VALUES(?,?,?,?,?,?)";

		PreparedStatement sentencia = conexion.prepareStatement(sql);
		sentencia.setString(1, juego.getNombre());
		sentencia.setString(2, juego.getImagen());
		sentencia.setInt(3, juego.getCopias());
		sentencia.setFloat(4, juego.getPrecio());
		sentencia.setInt(5, juego.getValoracion());
		sentencia.setInt(6, juego.getDuracio());

		sentencia.executeUpdate();
		sentencia.close();
	}

	public void modificar(Juego juego) throws SQLException {

		String sql = "UPDATE pokemones SET nombre = ?, imagen = ?, copias = ? " + "precio = ?, valoracion = ?,duracion=? WHERE id = ?";
		PreparedStatement sentencia = conexion.prepareStatement(sql);
		sentencia.setString(1, juego.getNombre());
		sentencia.setString(2, juego.getImagen());
		sentencia.setInt(3, juego.getCopias());
		sentencia.setFloat(4, juego.getPrecio());
		sentencia.setInt(5, juego.getValoracion());
		sentencia.setInt(6, juego.getDuracio());
		
		sentencia.executeUpdate();
		sentencia.close();
	}

	public void eliminar(Juego juego) throws IOException, SQLException {
		String sql = "DELETE FROM juegos WHERE id=?";

		PreparedStatement sentencia = conexion.prepareStatement(sql);
		sentencia.setLong(1, juego.getId());
		sentencia.executeUpdate();
		sentencia.close();

	}

	public void eliminarTodo() throws IOException, SQLException {
		String sql = "DELETE FROM juegos";
		PreparedStatement sentencia = conexion.prepareStatement(sql);
		sentencia.executeUpdate();
		sentencia.close();
	}
	
	public List<Juego> getJuegos() throws SQLException {
		Juego juego = null;
		List<Juego> juegos = new ArrayList();
		String sql = "SELECT id, nombre,imagen,copias,precio,valoracion,duracion " + "FROM juego";
		PreparedStatement sentencia = conexion.prepareStatement(sql);
		ResultSet resultado = sentencia.executeQuery();
		while (resultado.next()) {
			juego = obtenerJuegos(resultado);
			juegos.add(juego);
		}
		return juegos;
		
	}

	public List<Juego> getJuegos(String nombre)throws SQLException  {

		Juego juego = null;
		List<Juego> juegos = new ArrayList();
		String sql = "SELECT id, nombre,imagen,copias,precio,valoracion,duracion " + "FROM juego WHERE busquea=?";
		PreparedStatement sentencia = conexion.prepareStatement(sql);
		sentencia.setString(1, nombre);
		ResultSet resultado = sentencia.executeQuery();
		while (resultado.next()) {
			juego = obtenerJuegos(resultado);
			juegos.add(juego);
		}
		return juegos;
	}

	public Juego obtenerJuegos(ResultSet resultado) throws SQLException {

		Juego juego = new Juego();
		juego.setId(resultado.getLong(1));
		juego.setNombre(resultado.getString(2));
		juego.setImagen(resultado.getString(3));
		juego.setCopias(resultado.getInt(4));
		juego.setPrecio(resultado.getFloat(5));
		juego.setValoracion(resultado.getInt(6));
		juego.setDuracio(resultado.getInt(7));

		return juego;
	}

}
