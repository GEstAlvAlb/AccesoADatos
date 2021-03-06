import java.sql.SQLException;

import com.mysql.cj.util.Util;


public class Controlador {

	private Modelo modelo;
	private Vista vista;

	public Controlador(Modelo modelo, Vista vista) {
		this.modelo = modelo;
		this.vista = vista;

		try {
			modelo.conectar();
			iniciarSesion();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		iniciarSesion();
	}

	private void iniciarSesion() {
		boolean autenticado = false;
		Login login =new Login();
		int intentos =1;
		
		do {
			login.mostrarDialogo();
			String usuario = login.getUsuario();
			String contrasena = login.getContrasena();

			try {
				autenticado = modelo.inicaiarSesion(usuario, contrasena);
				if(!autenticado) {
					if(!autenticado) {
						
						UtilM.mensajeError("Limite de intentos");
						System.exit(0);
					}
					login.limpiarContrasena();
					login.setMensaje("Usuario/contraseņa erronea");
					intentos++;
					
					continue;
					
							}
				UtilM.mensajeInformacion("Has iniciado sesion");
			} catch (SQLException sqle) {
				UtilM.mensajeError("No se h a podido concectar");
			}
		}while(!autenticado);
	}

}