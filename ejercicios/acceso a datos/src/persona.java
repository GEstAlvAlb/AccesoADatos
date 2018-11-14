
public class persona {
	String nombre;

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	
	persona(String nombre){ //constructor
		this.nombre=nombre;
	}
	
	public String getPersona() {
		return nombre;
	}

	public void setPersona(String persona) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		
		return "persona [nombre=" + nombre + "]";
		
		
	}
	
}
