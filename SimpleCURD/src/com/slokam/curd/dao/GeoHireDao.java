package com.slokam.curd.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.slokam.curd.pojo.GeoHirePojo;
@Component
public class GeoHireDao {
     @Autowired
	private HibernateTemplate hibernateTemplate;
     public void saveGeoHire(GeoHirePojo pojo)
     {
    	 hibernateTemplate.save(pojo);
     }
     
     public List<GeoHirePojo> getAllGeoHire()
     {
    	List<GeoHirePojo>  pojo=(List<GeoHirePojo>) hibernateTemplate.find("from GeoHirePojo");
    	System.out.println(".............");
    	return pojo;
     }
     public GeoHirePojo getGeiHirePojo(Integer id)
     {
    	 return hibernateTemplate.get(GeoHirePojo.class, id);
     }
     public void updateGeoHIre(GeoHirePojo pojo)
     {
    	 hibernateTemplate.update(pojo);
     }
     public void deleteGeoHire(GeoHirePojo pojo)
     {
    	 hibernateTemplate.delete(pojo);
     }
     /*public List<GeoHirePojo> sortGeoHireName(GeoHirePojo pojo)
     {
    	 List<GeoHirePojo>  pojo1=(List<GeoHirePojo>) hibernateTemplate.find("select g.name from GeoHirePojo.geohire g");
    	 return pojo1;
     }*/
     
     
	
}
