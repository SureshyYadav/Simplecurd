package com.slokam.curd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slokam.curd.interfaces.IPersonDao;
import com.slokam.curd.interfaces.IPersonService;
import com.slokam.curd.pojo.Search;
@Service
public class PersonService implements IPersonService{
	@Autowired
	private IPersonDao dao;

	public List<Object[]> search(Search pojo) {
		return dao.search(pojo);
		
	}

}
