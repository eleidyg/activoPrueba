package com.activos.empresaprueba.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="ciudad")
public class Ciudad implements Serializable{

	@Id
    @Column(name="idciudad")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idCiudad;
	
	@Column(name="nombre")
	private String nombre;
	
	

	public Ciudad(String nombre) {
		super();
		this.nombre = nombre;
	}

	public Ciudad() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getIdCiudad() {
		return idCiudad;
	}

	public void setIdCiudad(long idCiudad) {
		this.idCiudad = idCiudad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	
}
