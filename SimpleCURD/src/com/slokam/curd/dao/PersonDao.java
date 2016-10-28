package com.slokam.curd.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.slokam.curd.interfaces.IPersonDao;
import com.slokam.curd.pojo.Person;
import com.slokam.curd.pojo.Search;
@Repository
public class PersonDao implements IPersonDao{
	@Autowired
	private HibernateTemplate template;
	public List<Object[]> search(Search pojo) {
	DetachedCriteria dc=DetachedCriteria.forClass(Person.class,"p");//with out creating session we can use
	dc.createAlias("p.aadhar", "a");
	dc.createAlias("a.person", "pr");
	if(pojo.getName()!=null && pojo.getName().trim().length()>0)
		  dc.add(Restrictions.eq("p.name", pojo.getName()));
	if(pojo.getNumber()!=null)
		dc.add(Restrictions.eq("p.phone", pojo.getNumber()));
	if(pojo.getAadharNumber()!=null)
		dc.add(Restrictions.eq("p.aadhar", pojo.getAadharNumber()));
	ProjectionList prolist=Projections.projectionList();
	prolist.add(Projections.property("p.name"));
	prolist.add(Projections.property("p.phone"));
	prolist.add(Projections.property("p.aadhar"));
	dc.setProjection(prolist);
	List<Object[]> list=(List<Object[]>) template.findByCriteria(dc);
	System.out.println(list);
		
		return list;
	}

}
