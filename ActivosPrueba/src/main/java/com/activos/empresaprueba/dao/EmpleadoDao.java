package com.activos.empresaprueba.dao;

import java.util.List;

import com.activos.empresaprueba.model.Empleado;



public interface EmpleadoDao {
	
	void saveEmpleado(Empleado empleado);
	
	void deleteEmpleadoById(Long idEmpleado);
	
	void updateEmpleado(Empleado empleado);
	
	List<Empleado> findAllEmpleado();
	
	Empleado findById(Long idEstados);
	
	Empleado findByName(String name);

}
