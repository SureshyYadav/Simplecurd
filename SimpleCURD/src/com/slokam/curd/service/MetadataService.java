package com.slokam.curd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slokam.curd.dao.MetadataDao;
import com.slokam.curd.pojo.Country;
import com.slokam.curd.pojo.State;

@Service
public class MetadataService {
	@Autowired
	private MetadataDao metaData;
	
	public List<Country>getDataFromCountry(){
		return metaData.getDataFromCountry();
	}
	public List<State>getDataFromState(Integer id){
		return metaData.getDataFromState(id);
	}
	

}
