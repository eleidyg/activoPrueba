package com.activos.empresaprueba.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.activos.empresaprueba.dao.AreaDao;
import com.activos.empresaprueba.model.Area;

@Service("areaService")
@Transactional
public class AreaServiceImpl implements AreaService{
	
	@Autowired
	private AreaDao _areaDao;

	@Override
	public void saveArea(Area area) {
		_areaDao.saveArea(area);
		
	}

	@Override
	public void deleteAreaById(Long idArea) {
		_areaDao.deleteAreaById(idArea);
		
	}

	@Override
	public void updateArea(Area area) {
		_areaDao.updateArea(area);
		
	}

	@Override
	public List<Area> findAllAreas() {
		
		return _areaDao.findAllAreas();
	}

	@Override
	public Area findById(Long idArea) {
		
		return _areaDao.findById(idArea);
	}

	@Override
	public Area findByName(String name) {
		
		return _areaDao.findByName(name);
	}

	@Override
	public List<Area> findByIdCiudad(Long idCiudad) {
		
		return _areaDao.findByIdCiudad(idCiudad);
	}
	
	

}
