package com.slokam.curd.interfaces;

import java.util.List;

import com.slokam.curd.pojo.Search;

public interface IPersonDao {
	public abstract List<Object[]> search(Search pojo);

}
