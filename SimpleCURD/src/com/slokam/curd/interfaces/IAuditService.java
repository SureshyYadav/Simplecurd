package com.slokam.curd.interfaces;

import com.slokam.curd.pojo.Audit;
import com.slokam.curd.pojo.GeoHirePojo;

public interface IAuditService {
	
	public void doAudit(GeoHirePojo old,GeoHirePojo newValue);

}
