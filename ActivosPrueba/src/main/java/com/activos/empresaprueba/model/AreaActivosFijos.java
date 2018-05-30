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
@Table(name="area_activosfijos")
public class AreaActivosFijos implements Serializable{

	@Id
    @Column(name="id_area_activosfijos")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idAreaActivosFijos;
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="idarea")
	private Area area;
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="idactivos")
	private Activos activos;
	
	
	public AreaActivosFijos(Area area, Activos activos) {
		super();
		this.area = area;
		this.activos = activos;
	}


	public Area getArea() {
		return area;
	}


	public void setArea(Area area) {
		this.area = area;
	}


	public Activos getActivos() {
		return activos;
	}


	public void setActivos(Activos activos) {
		this.activos = activos;
	}


	public AreaActivosFijos() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
