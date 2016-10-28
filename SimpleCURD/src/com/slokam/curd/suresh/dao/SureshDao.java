package com.slokam.curd.suresh.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.slokam.curd.suresh.pojo.PancardPojo;
@Component
public class SureshDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;
	public void savePan(PancardPojo pojo){
		
		hibernateTemplate.save(pojo);
		
	}

}
