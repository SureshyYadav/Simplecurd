package com.slokam.curd.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.slokam.curd.dao.AuditDao;
import com.slokam.curd.interfaces.IAuditDao;
import com.slokam.curd.interfaces.IAuditService;
import com.slokam.curd.pojo.Audit;
import com.slokam.curd.pojo.GeoHirePojo;
@Service
public class AuditService implements IAuditService {
	@Autowired(required=true)
	private IAuditDao dao;
@Transactional
	public void doAudit(GeoHirePojo old, GeoHirePojo newValue) {
		if(!old.getCode().equals(newValue.getCode())){
			Audit audit=new Audit();
			audit.setClassName(GeoHirePojo.class.toString());
			audit.setCurrentValue(newValue.getCode());
			audit.setPreValue(old.getCode());
			audit.setIpaddress("192.168.1.10");
			audit.setPropertyName("code");
			audit.setTime(new Date());
			audit.setUser("Suresh");
			dao.doAudit(audit);
		}
		/*if(!old.getCode().equals(newValue.getCode())){
			Audit audit=new Audit();
			audit.setClassName(GeoHirePojo.class.toString());
			audit.setCurrentValue(newValue.getCode());
			audit.setPreValue(old.getCode());
			audit.setIpaddress("192.168.1.10");
			audit.setPropertyName("code");
			audit.setTime(new Date());
			audit.setUser("Suresh");
		}*/

	}

}
