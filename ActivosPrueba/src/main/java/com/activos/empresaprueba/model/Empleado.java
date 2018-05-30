package com.activos.empresaprueba.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="empleado")
public class Empleado implements Serializable{

	@Id
    @Column(name="idempleado")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idEmpleado;
	
	@Column(name="nombreapellido")
	private String nombreapellido;
	
	@Column(name="documento")
	private String documento;
	
	@Column(name="tipodocumento")
	private String tipodocumento;
	
	@OneToMany(mappedBy="empleado")
	private Set<Activos> activos;
	
	public Empleado() {
		// TODO Auto-generated constructor stub
	}


	public Empleado(String nombreapellido, String documento, String tipodocumento) {
		super();
		this.nombreapellido = nombreapellido;
		this.documento = documento;
		this.tipodocumento = tipodocumento;
	}


	public Set<Activos> getActivos() {
		return activos;
	}


	public void setActivos(Set<Activos> activos) {
		this.activos = activos;
	}


	public long getIdEmpleado() {
		return idEmpleado;
	}


	public void setIdEmpleado(long idEmpleado) {
		this.idEmpleado = idEmpleado;
	}


	public String getNombreapellido() {
		return nombreapellido;
	}


	public void setNombreapellido(String nombreapellido) {
		this.nombreapellido = nombreapellido;
	}


	public String getDocumento() {
		return documento;
	}


	public void setDocumento(String documento) {
		this.documento = documento;
	}


	public String getTipodocumento() {
		return tipodocumento;
	}


	public void setTipodocumento(String tipodocumento) {
		this.tipodocumento = tipodocumento;
	}
	

}
