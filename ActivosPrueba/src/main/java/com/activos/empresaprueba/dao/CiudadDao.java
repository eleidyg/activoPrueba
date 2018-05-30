package com.activos.empresaprueba.dao;

import java.util.List;

import com.activos.empresaprueba.model.Ciudad;


public interface CiudadDao {
	void saveCiudad(Ciudad ciudad);
	
	void deleteCiudadById(Long idCiudad);
	
	void updateCiudad(Ciudad ciudad);
	
	List<Ciudad> findAllCiudad();
	
	Ciudad findById(Long idCiudad);
	
	Ciudad findByName(String name);
	
	
}
