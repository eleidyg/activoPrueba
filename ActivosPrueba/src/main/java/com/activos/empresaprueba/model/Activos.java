package com.activos.empresaprueba.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
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
@Table(name="activosfijos")
public class Activos implements Serializable{

	@Id
    @Column(name="idactivos")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idActivos;
	
	@Column(name="nombre_activo")
	private String nombreactivo;
	
	@Column(name="descripcion")
	private String descripcion;
	
	@Column(name="tipo")
	private String tipo;
	
	@Column(name="serial")
	private String serial;
	
	@Column(name="inventario")
	private String inventario;
	
	@Column(name="peso")
	private Integer peso;
	
	@Column(name="ancho")
	private Integer ancho;
	
	@Column(name="largo")
	private Integer largo;
	
	@Column(name="valor_compra")
	private Double valorcompra;
	
	@Column(name="fecha_compra")
	private String fechacompra;
	
	@Column(name="fecha_baja")
	private String fecha_baja;
	
	@Column(name="color")
	private String color;
	
	@ManyToOne(optional=true, fetch=FetchType.EAGER)
	@JoinColumn(name="idempleado")
	private Empleado empleado;
	
	@ManyToOne(optional=true, fetch=FetchType.EAGER)
	@JoinColumn(name="idestados")
	private Estados estados;

	@OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="idactivos")
	@JsonIgnore
	private Set<AreaActivosFijos> areaActivosFijos;

	public Activos() {
		// TODO Auto-generated constructor stub
	}


	public Activos(String nombreactivo, String descripcion, String tipo, String serial, String inventario, Integer peso,
			Integer ancho, Integer largo, Double valorcompra, String fechacompra, String fecha_baja, String color) {
		super();
		this.nombreactivo = nombreactivo;
		this.descripcion = descripcion;
		this.tipo = tipo;
		this.serial = serial;
		this.inventario = inventario;
		this.peso = peso;
		this.ancho = ancho;
		this.largo = largo;
		this.valorcompra = valorcompra;
		this.fechacompra = fechacompra;
		this.fecha_baja = fecha_baja;
		this.color = color;
	}


	public Set<AreaActivosFijos> getAreaActivosFijos() {
		return areaActivosFijos;
	}


	public void setAreaActivosFijos(Set<AreaActivosFijos> areaActivosFijos) {
		this.areaActivosFijos = areaActivosFijos;
	}


	public long getIdActivos() {
		return idActivos;
	}


	public void setIdActivos(long idActivos) {
		this.idActivos = idActivos;
	}


	public String getNombreactivo() {
		return nombreactivo;
	}


	public void setNombreactivo(String nombreactivo) {
		this.nombreactivo = nombreactivo;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getSerial() {
		return serial;
	}


	public void setSerial(String serial) {
		this.serial = serial;
	}


	public String getInventario() {
		return inventario;
	}


	public void setInventario(String inventario) {
		this.inventario = inventario;
	}


	public Integer getPeso() {
		return peso;
	}


	public void setPeso(Integer peso) {
		this.peso = peso;
	}


	public Integer getAncho() {
		return ancho;
	}


	public void setAncho(Integer ancho) {
		this.ancho = ancho;
	}


	public Integer getLargo() {
		return largo;
	}


	public void setLargo(Integer largo) {
		this.largo = largo;
	}


	public Double getValorcompra() {
		return valorcompra;
	}


	public void setValorcompra(Double valorcompra) {
		this.valorcompra = valorcompra;
	}


	public String getFechacompra() {
		return fechacompra;
	}


	public void setFechacompra(String fechacompra) {
		this.fechacompra = fechacompra;
	}


	public String getFecha_baja() {
		return fecha_baja;
	}


	public void setFecha_baja(String fecha_baja) {
		this.fecha_baja = fecha_baja;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public Empleado getEmpleado() {
		return empleado;
	}


	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}


	public Estados getEstados() {
		return estados;
	}


	public void setEstados(Estados estados) {
		this.estados = estados;
	}

	
}
