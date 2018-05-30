package com.activos.empresaprueba.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.activos.empresaprueba.dao.CiudadDao;
import com.activos.empresaprueba.model.Ciudad;



@Service("ciudadService")
@Transactional
public class CiudadServiceImpl implements CiudadService {

	@Autowired
	private CiudadDao _ciudadDao;

	@Override
	public void saveCiudad(Ciudad ciudad) {
		_ciudadDao.saveCiudad(ciudad);
		
	}

	@Override
	public void deleteCiudadById(Long idCiudad) {
		_ciudadDao.deleteCiudadById(idCiudad);
		
	}

	@Override
	public void updateCiudad(Ciudad ciudad) {
		_ciudadDao.updateCiudad(ciudad);
		
	}

	@Override
	public List<Ciudad> findAllCiudad() {
		
		return _ciudadDao.findAllCiudad();
	}

	@Override
	public Ciudad findById(Long idCiudad) {
		
		return _ciudadDao.findById(idCiudad);
	}

	@Override
	public Ciudad findByName(String name) {
		
		return _ciudadDao.findByName(name);
	}

	

}
