package com.activos.empresaprueba.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.activos.empresaprueba.model.Ciudad;

@Repository
@Transactional
public class CiudadDaoImpl extends AbstractSession implements CiudadDao {

	@Override
	public void saveCiudad(Ciudad ciudad) {
		// TODO Auto-generated method stub
		getSession().persist(ciudad);
	}

	@Override
	public void deleteCiudadById(Long idCiudad) {
		// TODO Auto-generated method stub
		Ciudad ciudad = findById(idCiudad);
		if (ciudad  != null) {
			getSession().delete(ciudad );
		}
	}

	@Override
	public void updateCiudad(Ciudad ciudad) {
		// TODO Auto-generated method stub
		getSession().update(ciudad);
	}

	@Override
	public List<Ciudad> findAllCiudad() {
		// TODO Auto-generated method stub
		return getSession().createQuery("from Ciudad").list();
	}

	@Override
	public Ciudad findById(Long idCiudad) {
		// TODO Auto-generated method stub
		return (Ciudad) getSession().get(Ciudad.class, idCiudad);
	}

	@Override
	public Ciudad findByName(String name) {
		// TODO Auto-generated method stub
		return (Ciudad) getSession().createQuery(
				"from Course where nombre = :name")
				.setParameter("name", name).uniqueResult();
	}

	

}
