package com.slokam.curd.aspect;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectTest {
	Logger logger=Logger.getLogger(AspectTest.class);
	@Before("execution(* com.slokam.curd.*.*.*(..))")
	public void before(JoinPoint join){
		//System.out.println("Hai Before...method"+" "+join.getSignature().getName()+" "+join.getTarget().getClass());
		logger.info("Before...method"+" "+join.getSignature().getName()+" "+join.getTarget().getClass());
	}
	@After("execution(* com.slokam.curd.*.*.*(..))")
	public void after(JoinPoint join){
		//System.out.println("Hai After...method"+" "+join.getSignature().getName()+" "+join.getTarget().getClass());
		logger.info("Before...method"+" "+join.getSignature().getName()+" "+join.getTarget().getClass());
	}

}
