package com.activos.empresaprueba.service;

import java.util.Date;
import java.util.List;

import com.activos.empresaprueba.model.Activos;


 public interface ActivosService {

	
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
