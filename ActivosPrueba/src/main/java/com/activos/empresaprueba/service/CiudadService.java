package com.activos.empresaprueba.service;

import java.util.List;

import com.activos.empresaprueba.model.Ciudad;


public interface CiudadService {

    void saveCiudad(Ciudad ciudad);
	
	void deleteCiudadById(Long idCiudad);
	
	void updateCiudad(Ciudad ciudad);
	
	List<Ciudad> findAllCiudad();
	
	Ciudad findById(Long idCiudad);
	
	Ciudad findByName(String name);
}
