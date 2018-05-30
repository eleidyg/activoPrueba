package com.activos.empresaprueba.dao;

import java.util.List;

import com.activos.empresaprueba.model.Estados;


public interface EstadosDao {
	
	void saveEstados(Estados estados);
	
	void deleteEstadosById(Long idEstados);
	
	void updateEstados(Estados estados);
	
	List<Estados> findAllEstados();
	
	Estados findById(Long idEstados);
	
	Estados findByName(String name);

}
