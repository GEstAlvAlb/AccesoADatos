import java.util.*;
public class empleadoJ {

	String nom;
	String apell;
	empleadoJ(String nom, String apell)
	{
		this.nom = nom;
		this.apell = apell;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getApell() {
		return apell;
	}

	public void setApell(String apell) {
		this.apell = apell;
	}

	@Override
	public String toString() {
		return "Empleado [nom=" + nom + ", apell=" + apell + "]";
	}

	
	
}
