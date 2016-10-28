package com.slokam.curd.security;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.slokam.curd.dao.LoginDao;

@Component
public class UserDetailsServiceImpl implements UserDetailsService {
	@Autowired
	private LoginDao loginDao;

	public UserDetails loadUserByUsername(String arg0)
			throws UsernameNotFoundException {
		
		return loginDao.loaduserByUsername(arg0);
		
		
		/*GrantedAuthorityImpl gat=new GrantedAuthorityImpl();
		gat.setAuthority("ROLE_USER");
		GrantedAuthorityImpl gat1=new GrantedAuthorityImpl();
		gat1.setAuthority("ROLE_ADMIN");
		Collection<GrantedAuthorityImpl> authorities=new ArrayList();
		authorities.add(gat);
		authorities.add(gat1);
		UserDetailsImpl impl=new UserDetailsImpl();
		impl.setUsername("suresh");
		impl.setPassword("suresh");
		impl.setAuthorities(authorities);
		return impl;*/
		
	}

}
