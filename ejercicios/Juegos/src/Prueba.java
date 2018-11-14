import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Prueba {

	public static void main(String[] args) {
		Connection conexion = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conexion = DriverManager.getConnection("jdbc:mysql://192.168.34.5:3306/damt", "damt", "damt");
			System.out.println("Conexion establecida con exito");
			
			String sentenciaSQL = "INSERT INTO juegos (nombre,descripcion,genero,precio,desarrolladora) VALUES (?,?,?,?,?)";
			PreparedStatement sentencia = null;
			
			try {
				sentencia=conexion.prepareStatement(sentenciaSQL);
				sentencia.setString(1, "Red Dead Redemption 2");
				sentencia.setString(2, "mejor Juego del mundo");
				sentencia.setString(3, "suter");
				sentencia.setInt(4, 65);
				sentencia.setString(5, "Alberto.SA");
				sentencia.executeUpdate();
			}catch(SQLException sqle) {
				sqle.printStackTrace();
			}finally {
				if(sentencia!=null) {
					try {
						sentencia.close();
					}catch(SQLException sqle) {
						sqle.printStackTrace();
					}
				}
					
			}
			
			
		} catch (ClassNotFoundException cnfe) {
			System.out.println("no se ha podido encontrar el dicer de conexion");
		} catch (SQLException sqle) {
			sqle.printStackTrace();
			System.out.println("Se ha producido un error al conectaer con la base de datos");
			System.out.println("Comprobar el sercidor");
		}
	}
}
