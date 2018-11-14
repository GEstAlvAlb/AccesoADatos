package base;

public class Juego {

	private String nombre;
	private String imagen;
	private int copias;
	// TODO feha hay que ponerle algo con fechas
	private int duracio;
	private float precio;
	
	

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return nombre;
	}

	/**
	 * @return the imagen
	 */
	public String getImagen() {
		return imagen;
	}

	/**
	 * @param imagen the imagen to set
	 */
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the copias
	 */
	public int getCopias() {
		return copias;
	}

	/**
	 * @param copias the copias to set
	 */
	public void setCopias(int copias) {
		this.copias = copias;
	}

	/**
	 * @return the duracio
	 */
	public int getDuracio() {
		return duracio;
	}

	/**
	 * @param duracio the duracio to set
	 */
	public void setDuracio(int duracio) {
		this.duracio = duracio;
	}

	/**
	 * @return the precio
	 */
	public float getPrecio() {
		return precio;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(float precio) {
		this.precio = precio;
	}

}
