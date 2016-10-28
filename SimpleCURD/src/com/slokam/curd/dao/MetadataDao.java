package com.slokam.curd.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.slokam.curd.pojo.Country;
import com.slokam.curd.pojo.State;

@Repository
public class MetadataDao {
	@Autowired
	private HibernateTemplate ht;
	public List<Country>getDataFromCountry(){
		  List<Country> list = (List<Country>)ht.find("from Country");
		  return list;
	}
	public List<State>getDataFromState(Integer id){
		  List<State> list = (List<State>)ht.find(" select s from State s join s.country c where c.id=?",id);
		  return list;
	}
	

}
