package com.slokam.curd.manytomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate4.HibernateTemplate;

import com.slokam.curd.security.UserDetailsImpl;

public class ManytoManyTest {
	@Autowired
	private HibernateTemplate hibernateTemplate;

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("test.xml");
		/*SessionFactory sf=(SessionFactory) context.getBean("sessionFactory");
		Session ses=sf.openSession();
		UserDetailsImpl impl=new UserDetailsImpl();
		System.out.println(impl.getUsername());*/
		HibernateTemplate ht=(HibernateTemplate) context.getBean("hibernateTemplate");
	 UserDetailsImpl user=(UserDetailsImpl) ht.get(UserDetailsImpl.class, 12);
	 System.out.println(user.getUsername());

	}

}
