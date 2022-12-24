package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class MyDemoLoggingAspect {
	
	@Before("com.luv2code.aopdemo.aspect.Luv_aop_aspect.allmethodexceptgetset()")
	public void beforefewthings(JoinPoint thejoinpoint)
	{
		System.out.println("=====>>>>> LOGGING ASPECT");
		MethodSignature methodSig = (MethodSignature) thejoinpoint.getSignature();
		
		System.out.println("Method = "+methodSig);
		
		Object[] args = thejoinpoint.getArgs();
		
		for(Object temp : args) {
			System.out.println(temp);
		}
	}
	
	
	
	
}
