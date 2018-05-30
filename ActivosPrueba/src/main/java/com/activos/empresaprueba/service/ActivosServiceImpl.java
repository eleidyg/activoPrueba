package com.activos.empresaprueba.service;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.activos.empresaprueba.dao.ActivosDao;
import com.activos.empresaprueba.dao.CiudadDao;
import com.activos.empresaprueba.model.Activos;


@Service("activoService")
@Transactional
public class ActivosServiceImpl implements ActivosService{

	@Autowired
	private ActivosDao _activosDao;

	@Override
	public void saveActivos(Activos activos) {
		_activosDao.saveActivos(activos);
		
	}

	@Override
	public void deleteActivosById(Long id) {
		_activosDao.deleteActivosById(id);
		
	}

	@Override
	public void updateActivos(Activos activos) {
		_activosDao.updateActivos(activos);
		
	}

	@Override
	public List<Activos> findAllActivos() {
		
		return _activosDao.findAllActivos();
	}

	@Override
	public Activos findById(Long idActivos) {
		
		return _activosDao.findById(idActivos);
	}

	@Override
	public Activos findByName(String name) {
		
		return _activosDao.findByName(name);
	}

	@Override
	public Activos findByDateOfPurchase(String date) {
		
		return _activosDao.findByDateOfPurchase(date);
	}

	@Override
	public Activos findByType(String tipo) {
		
		return _activosDao.findByType(tipo);
	}

	@Override
	public Activos findBySerial(String serial) {
		
		return _activosDao.findBySerial(serial);
	}
	
	
}
