package com.activos.empresaprueba.dao;


import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;


import com.activos.empresaprueba.model.Activos;
import com.activos.empresaprueba.model.AreaActivosFijos;

@Repository
@Transactional
public class ActivosDaoImpl extends AbstractSession implements ActivosDao {

	@Override
	public void saveActivos(Activos activos) {
		// TODO Auto-generated method stub
		getSession().persist(activos);
	}

	@Override
	public void deleteActivosById(Long id) {
		// TODO Auto-generated method stub
		Activos activos = findById(id);
		if (activos  != null) {
			getSession().delete(activos);
		}
	}

	@Override
	public void updateActivos(Activos activos) {
		// TODO Auto-generated method stub
		getSession().update(activos);
	}

	@Override
	public List<Activos> findAllActivos() {
		// TODO Auto-generated method stub
		return getSession().createQuery("from Activos").list();
	}

	@Override
	public Activos findById(Long idActivos) {
		// TODO Auto-generated method stub
		return (Activos) getSession().get(Activos.class, idActivos);
	}

	@Override
	public Activos findByName(String name) {
		// TODO Auto-generated method stub
		return (Activos) getSession().createQuery(
				"from Activos where nombreactivo = :name")
				.setParameter("name", name).uniqueResult();
	}

	@Override
	public Activos findByDateOfPurchase(String date) {
		// TODO Auto-generated method stub
		return (Activos) getSession().createQuery(
				"from Activos where fechacompra = :fechacompra")
				.setParameter("fechacompra", date).uniqueResult();
	}

	@Override
	public Activos findByType(String tipo) {
		// TODO Auto-generated method stub
		return (Activos) getSession().createQuery(
				"from Activos where tipo = :tipo")
				.setParameter("tipo", tipo).uniqueResult();
	}

	@Override
	public Activos findBySerial(String serial) {
		// TODO Auto-generated method stub
		return (Activos) getSession().createQuery(
				"from Activos where serial = :serial")
				.setParameter("serial", serial).uniqueResult();
	}

	

}





