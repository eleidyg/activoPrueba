package com.activos.empresaprueba.dao;

import java.util.Iterator;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.activos.empresaprueba.model.Empleado;
import com.activos.empresaprueba.model.Estados;

@Repository
@Transactional
public class EmpleadoDaoImpl extends AbstractSession implements EmpleadoDao {
	
	public void saveEmpleado(Empleado empleado) {
		// TODO Auto-generated method stub
		getSession().persist(empleado);
	}

	public void deleteEmpleadoById(Long idEmpleado) {
		// TODO Auto-generated method stub
		Empleado empleado = findById(idEmpleado);
		if (empleado != null) {
			getSession().delete(empleado);
		}
	}

	public void updateEmpleado(Empleado empleado) {
		// TODO Auto-generated method stub
		getSession().update(empleado);
	}

	public List<Empleado> findAllEmpleado() {
		// TODO Auto-generated method stub
		return getSession().createQuery("from Empleado").list();
	}

	public Empleado findById(Long idEmpleado) {
		// TODO Auto-generated method stub
		return (Empleado) getSession().get(Empleado.class, idEmpleado);
	}

	public Empleado findByName(String name) {
		// TODO Auto-generated method stub
		return (Empleado) getSession().createQuery(
				"from Empleado where nombreapellido = :name")
				.setParameter("name", name).uniqueResult();
	}

	

}
