
public class Ejer1 {

	String nodelo;
	String marca;
	String precio;
	String fecha;
	
	
	/**
	 * @return the nodelo
	 */
	public String getNodelo() {
		return nodelo;
	}
	/**
	 * @param nodelo the nodelo to set
	 */
	public void setNodelo(String nodelo) {
		this.nodelo = nodelo;
	}
	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}
	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}
	/**
	 * @return the precio
	 */
	public String getPrecio() {
		return precio;
	}
	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(String precio) {
		this.precio = precio;
	}
	/**
	 * @return the fecha
	 */
	public String getFecha() {
		return fecha;
	}
	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String toString() {
		return nodelo+ " " +" "+ precio;
		
	}

	
	
}
