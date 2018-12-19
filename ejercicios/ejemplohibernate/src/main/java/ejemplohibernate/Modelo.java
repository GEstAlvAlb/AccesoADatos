package ejemplohibernate;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.hibernate.Session;

import ejemplohibernate.base.Personaje;


public class Modelo {
	
	public Modelo() {
		conectar();
	}
	
	private void conectar() {
		HibernateUtil.buildSessionFactory();
		
	}
	
	private void desconectar(){
		
		HibernateUtil.closeSessionFactory();
	}
	
	@Override
	public void finalize() {
		desconectar();
	}
	
	public void guardar(Personaje personaje) throws SQLException {
		Session sesion=HibernateUtil.getCurrentSession();
		sesion.beginTransaction();
		sesion.save(personaje);
		sesion.getTransaction().commit();
		sesion.close();
		
		
	}
	
	public void modificar(Personaje personaje) throws SQLException {
		Session sesion=HibernateUtil.getCurrentSession();
		sesion.beginTransaction();
		sesion.save(personaje);
		sesion.getTransaction().commit();
		sesion.close();
		
	}
	
	public void eliminar(Personaje personaje) throws SQLException {
		
		Session sesion=HibernateUtil.getCurrentSession();
		sesion.beginTransaction();
		sesion.delete(personaje);
		sesion.getTransaction().commit();;
		sesion.close();
	}
	public List<Personaje> getPersonaje() {
		Session sesion=HibernateUtil.getCurrentSession();
		ArrayList<Personaje> personajes=(ArrayList<Personaje>)  sesion.createQuery("FROM Personaje");
		return personajes;
		
	}
	public Personaje GetPersonaje(String nombre) {
		return null;
		
	}
	
	public List<Personaje> getPersonajes(String busqueda) {
		return null;
		
	}
}
