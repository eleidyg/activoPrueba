package com.activos.empresaprueba.dao;

import java.util.Iterator;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;


import com.activos.empresaprueba.model.Estados;

@Repository
@Transactional
public class EstadosDaoImpl extends AbstractSession implements EstadosDao {
	
	public void saveEstados(Estados estado) {
		// TODO Auto-generated method stub
		getSession().persist(estado);
	}

	public void deleteEstadosById(Long idEstado) {
		// TODO Auto-generated method stub
		Estados estado = findById(idEstado);
		if (estado != null) {
			getSession().delete(estado);
		}
	}

	public void updateEstados(Estados estado) {
		// TODO Auto-generated method stub
		getSession().update(estado);
	}

	public List<Estados> findAllEstados() {
		// TODO Auto-generated method stub
		return getSession().createQuery("from Estados").list();
	}

	public Estados findById(Long idEstados) {
		// TODO Auto-generated method stub
		return (Estados) getSession().get(Estados.class, idEstados);
	}

	public Estados findByName(String name) {
		// TODO Auto-generated method stub
		return (Estados) getSession().createQuery(
				"from Estados where estado = :name")
				.setParameter("name", name).uniqueResult();
	}

}
