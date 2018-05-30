package com.activos.empresaprueba.service;

import java.util.List;

import com.activos.empresaprueba.model.Empleado;


public interface EmpleadoService {

void saveEmpleado(Empleado empleado);
	
	void deleteEmpleadoById(Long idEmpleado);
	
	void updateEmpleado(Empleado empleado);
	
	List<Empleado> findAllEmpleado();
	
	Empleado findById(Long idEstados);
	
	Empleado findByName(String name);
}
