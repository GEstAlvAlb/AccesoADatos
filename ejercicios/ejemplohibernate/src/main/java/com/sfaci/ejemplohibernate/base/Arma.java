package com.sfaci.ejemplohibernate.base;

import javax.persistence.*;

@Entity
@Table(name="armas")

public class Arma {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private long id;
	@Column(name="nombre")
	private String nombre;
	@Column(name="ataque")
	private int ataque;
	@Column(name="duracion")
	private int duracion;
	
	@ManyToMany
	@JoinColumn(name="id_personaje")
	private Personaje personaje;
	
	public Arma() {}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getAtaque() {
		return ataque;
	}
	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	
	

}
