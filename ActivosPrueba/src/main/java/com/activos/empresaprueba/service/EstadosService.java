package com.activos.empresaprueba.service;

import java.util.List;

import com.activos.empresaprueba.model.Empleado;
import com.activos.empresaprueba.model.Estados;


public interface EstadosService {


	void saveEstados(Estados estados);
	
	void deleteEstadosById(Long idEstados);
	
	void updateEstados(Estados estados);
	
	List<Estados> findAllEstados();
	
	Estados findById(Long idEstados);
	
	Estados findByName(String name);
}
