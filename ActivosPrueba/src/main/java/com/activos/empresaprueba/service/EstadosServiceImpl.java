package com.activos.empresaprueba.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.activos.empresaprueba.dao.CiudadDao;
import com.activos.empresaprueba.dao.EmpleadoDao;
import com.activos.empresaprueba.dao.EstadosDao;
import com.activos.empresaprueba.model.Ciudad;
import com.activos.empresaprueba.model.Empleado;
import com.activos.empresaprueba.model.Estados;



@Service("estadosService")
@Transactional
public class EstadosServiceImpl implements EstadosService {

	@Autowired
	private EstadosDao _estadosDao;

	@Override
	public void saveEstados(Estados estados) {
		_estadosDao.saveEstados(estados);
		
	}

	@Override
	public void deleteEstadosById(Long idEstados) {
		_estadosDao.deleteEstadosById(idEstados);
		
	}

	@Override
	public void updateEstados(Estados estados) {
		_estadosDao.updateEstados(estados);
		
	}

	@Override
	public List<Estados> findAllEstados() {
		
		return _estadosDao.findAllEstados();
	}

	@Override
	public Estados findById(Long idEstados) {
		
		return _estadosDao.findById(idEstados);
	}

	@Override
	public Estados findByName(String name) {
		
		return _estadosDao.findByName(name);
	}

	
}
