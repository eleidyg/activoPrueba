package com.activos.empresaprueba.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.activos.empresaprueba.dao.CiudadDao;
import com.activos.empresaprueba.dao.EmpleadoDao;
import com.activos.empresaprueba.model.Ciudad;
import com.activos.empresaprueba.model.Empleado;



@Service("empleadoService")
@Transactional
public class EmpleadoServiceImpl implements EmpleadoService {

	@Autowired
	private EmpleadoDao _empleadoDao;

	@Override
	public void saveEmpleado(Empleado empleado) {
		_empleadoDao.saveEmpleado(empleado);
		
	}

	@Override
	public void deleteEmpleadoById(Long idEmpleado) {
		_empleadoDao.deleteEmpleadoById(idEmpleado);
		
	}

	@Override
	public void updateEmpleado(Empleado empleado) {
		_empleadoDao.updateEmpleado(empleado);
		
	}

	@Override
	public List<Empleado> findAllEmpleado() {
		
		return _empleadoDao.findAllEmpleado();
	}

	@Override
	public Empleado findById(Long idEstados) {
		
		return _empleadoDao.findById(idEstados);
	}

	@Override
	public Empleado findByName(String name) {
		
		return _empleadoDao.findByName(name);
	}

	
	

}
