package com.slokam.curd.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.slokam.curd.interfaces.IAuditDao;
import com.slokam.curd.pojo.Audit;
@Repository
public class AuditDao implements IAuditDao {
	@Autowired
	private HibernateTemplate template;

	public void doAudit(Audit audit) {
		template.save(audit);
		

	}

}
