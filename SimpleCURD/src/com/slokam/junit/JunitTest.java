package com.slokam.junit;

import com.slokam.curd.dao.LoginDao;

public class JunitTest {
	@org.junit.Test
	public void Test(){
		
		
		LoginDao login=new LoginDao();
		login.loaduserByUsername("suresh");
	}

}
