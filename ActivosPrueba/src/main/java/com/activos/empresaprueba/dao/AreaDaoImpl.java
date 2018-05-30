package com.activos.empresaprueba.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.activos.empresaprueba.model.Area;



@Repository
@Transactional
public class AreaDaoImpl extends AbstractSession implements AreaDao {

	@Override
	public void saveArea(Area area) {
		// TODO Auto-generated method stub
		getSession().persist(area);
	}

	@Override
	public void deleteAreaById(Long idArea) {
		// TODO Auto-generated method stub
		Area area = findById(idArea);
		if (area  != null) {
			getSession().delete(area );
		}
	}

	@Override
	public void updateArea(Area area) {
		// TODO Auto-generated method stub
		getSession().update(area);
	}

	@Override
	public List<Area> findAllAreas() {
		// TODO Auto-generated method stub
		return getSession().createQuery("from Area").list();
	}

	@Override
	public Area findById(Long idArea) {
		// TODO Auto-generated method stub
		return (Area) getSession().get(Area.class, idArea);
	}

	@Override
	public Area findByName(String name) {
		// TODO Auto-generated method stub
		return (Area) getSession().createQuery(
				"from Area where nombrearea = :name")
				.setParameter("name", name).uniqueResult();
	}

	@Override
	public List<Area> findByIdCiudad(Long idCiudad) {
		// TODO Auto-generated method stub
		return (List<Area>) getSession().createQuery(
				"from Ciudad c join c.area t where t.idCiudad = :idCiudad")
				.setParameter("idCiudad", idCiudad).list();
	}

}
