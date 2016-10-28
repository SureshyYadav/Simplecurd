package com.slokam.curd.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TiemAspect {
	
	long startTime=0;
	long endTime=0;
	@Before("execution(* com.slokam.curd.*.*.*(..))")
	public void before(){
		startTime= System.currentTimeMillis();
		
	}
	@After("execution(* com.slokam.curd.*.*.*(..))")
	public void after(){
		endTime= System.currentTimeMillis();
		System.out.println("Time Taken::"+(endTime-startTime));
		
	}
	

}
