package com.slokam.curd.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.slokam.curd.security.GrantedAuthorityImpl;
import com.slokam.curd.security.UserDetailsImpl;
import com.slokam.curd.security.UserDetailsServiceImpl;

@Repository
public class LoginDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;
	//@SuppressWarnings("unchecked")
	public UserDetailsImpl loaduserByUsername(String name){
		System.out.println("......Records are get");
		List<UserDetailsImpl> ulist=(List<UserDetailsImpl>) hibernateTemplate.find("from UserDetailsImpl u where u.username=?", name);
		System.out.println("Hi after user selection");
		UserDetailsImpl userDetails=ulist.get(0);
		List<GrantedAuthorityImpl> alist=(List<GrantedAuthorityImpl>) hibernateTemplate.find("select a from UserDetailsImpl u join u.authorities a where u.username=?", name);
		System.out.println("After authority selection");
		userDetails.setAuthorities(alist);
		
		return userDetails;
		
	}
	

}
