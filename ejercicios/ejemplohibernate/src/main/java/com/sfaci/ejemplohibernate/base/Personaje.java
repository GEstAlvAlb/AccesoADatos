package com.sfaci.ejemplohibernate.base;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="personajes")
public class Personaje {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private long id;
	@Column(name="nombre")
	private String nombre;
	@Column(name="descripcion")
	private String descripcion;
	@Column(name="vida")
	private int vida;
	@Column(name="ataque")
	private int ataque;
	
	@OneToMany(mappedBy="personaje")
	private List<Arma> armas;
	
	public Personaje(long id, String nombre, String descripcion, int vida, int ataque) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.vida = vida;
		this.ataque = ataque;
	}
	
	public Personaje() {}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}
	
	@Override
	public String toString() {
		return nombre;
	}
}
