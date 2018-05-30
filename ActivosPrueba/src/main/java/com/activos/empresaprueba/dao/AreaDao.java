package com.activos.empresaprueba.dao;

import java.util.List;

import com.activos.empresaprueba.model.Area;


public interface AreaDao {
	
	void saveArea(Area area);
	
	void deleteAreaById(Long idArea);
	
	void updateArea(Area area);
	
	List<Area> findAllAreas();
	
	Area findById(Long idArea);
	
	Area findByName(String name);
	
	List<Area> findByIdCiudad(Long idCiudad);
}
