package com.activos.empresaprueba.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="area")
public class Area implements Serializable{
	
	@Id
    @Column(name="idarea")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idArea;
	
	@Column(name="nombrearea")
	private String nombrearea;
	
	@ManyToOne(optional=true, fetch=FetchType.EAGER)
	@JoinColumn(name="ciudad_idciudad")
	private Area area;

	@OneToMany
	@JoinColumn(name="idarea")
	@JsonIgnore
	private Set<AreaActivosFijos> areaActivosFijos;
	
	
	public Area() {
		// TODO Auto-generated constructor stub
	}

	public Area(String nombrearea) {
		super();
		this.nombrearea = nombrearea;
	}
	

	public Set<AreaActivosFijos> getAreaActivosFijos() {
		return areaActivosFijos;
	}

	public void setAreaActivosFijos(Set<AreaActivosFijos> areaActivosFijos) {
		this.areaActivosFijos = areaActivosFijos;
	}

	public long getIdArea() {
		return idArea;
	}

	public void setIdArea(long idArea) {
		this.idArea = idArea;
	}

	public String getNombrearea() {
		return nombrearea;
	}

	public void setNombrearea(String nombrearea) {
		this.nombrearea = nombrearea;
	}

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}
	

}
