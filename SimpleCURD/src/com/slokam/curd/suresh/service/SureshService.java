package com.slokam.curd.suresh.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.slokam.curd.suresh.dao.SureshDao;
import com.slokam.curd.suresh.pojo.PancardPojo;
@Component
public class SureshService {
	@Autowired
	private SureshDao sureshDao;
	@Transactional
	public void savePan(PancardPojo pojo){
		sureshDao.savePan(pojo);
		
	}

}
