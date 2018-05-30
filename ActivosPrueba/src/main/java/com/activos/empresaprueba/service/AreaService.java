package com.activos.empresaprueba.service;

import java.util.List;

import com.activos.empresaprueba.model.Area;
import com.activos.empresaprueba.model.AreaActivosFijos;

public interface AreaService {
    
	void saveArea(Area area);
	
	void deleteAreaById(Long idArea);
	
	void updateArea(Area area);
	
	List<Area> findAllAreas();
	
	Area findById(Long idArea);
	
	Area findByName(String name);
	
	List<Area> findByIdCiudad(Long idCiudad);
}
