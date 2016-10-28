package com.slokam.curd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.slokam.curd.dao.GeoHireDao;
import com.slokam.curd.pojo.GeoHirePojo;
@Component
public class GeoHireService {
	@Autowired
	private GeoHireDao geoHireDao;
	@Transactional
	public void saveGeoHire(GeoHirePojo pojo)
	{
		geoHireDao.saveGeoHire(pojo);
	}
	public List<GeoHirePojo> getAllGeoHire()
	{
		List<GeoHirePojo> pojo=(List<GeoHirePojo>) geoHireDao.getAllGeoHire();
		return pojo;
	}
	@Transactional(readOnly=true)
	public GeoHirePojo getGeoHire(Integer id)
	{
		return geoHireDao.getGeiHirePojo(id);
	}
	@Transactional
	public void updateGeoHIre(GeoHirePojo pojo)
    {
   	 geoHireDao.updateGeoHIre(pojo);
    }@Transactional
	public void deleteGeoHire(GeoHirePojo pojo)
	{
		geoHireDao.deleteGeoHire(pojo);
	}
    

	
}
