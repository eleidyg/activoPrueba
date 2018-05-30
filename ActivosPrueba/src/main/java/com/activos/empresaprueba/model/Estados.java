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

import com.activos.empresaprueba.model.Activos;

@Entity
@Table(name="estados")
public class Estados implements Serializable{
	
	@Id
    @Column(name="idestados_activo")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idEstado;
	
	@Column(name="estado")
	private String estado;
	
	@OneToMany(mappedBy="estados")
	private Set<Activos> activos;
	
	
	public Set<Activos> getActivos() {
		return activos;
	}


	public void setActivos(Set<Activos> activos) {
		this.activos = activos;
	}


	public long getIdEstado() {
		return idEstado;
	}


	public void setIdEstado(long idEstado) {
		this.idEstado = idEstado;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}


	public Estados(String estado) {
		super();
		this.estado = estado;
	}


	public Estados() {
		// TODO Auto-generated constructor stub
	}

}
