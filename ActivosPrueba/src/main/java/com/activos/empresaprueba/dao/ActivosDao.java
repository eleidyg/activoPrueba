package com.activos.empresaprueba.dao;

import java.util.Date;
import java.util.List;


import com.activos.empresaprueba.model.Activos;
import com.activos.empresaprueba.model.AreaActivosFijos;

public interface ActivosDao {
	
	void saveActivos(Activos activos);
	
	void deleteActivosById(Long id);
	
	void updateActivos(Activos activos);
	
	List<Activos> findAllActivos();
	
	Activos findById(Long idActivos);
	
	Activos findByName(String name);
	
	Activos findByDateOfPurchase(String date);
	
	Activos findByType(String tipo);
	
	Activos findBySerial(String serial);
	
	
	
}
