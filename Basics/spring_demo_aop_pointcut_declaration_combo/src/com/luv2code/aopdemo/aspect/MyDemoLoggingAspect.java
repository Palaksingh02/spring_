package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {
	@Pointcut("execution(* com.luv2code.aopdemo.dao.*.*(..))")
	public void forDAOPackage() {}
	
	@Pointcut("execution(* com.luv2code.aopdemo.dao.*.set*(..))")
	public void forsetter() {}
	
	@Pointcut("execution(* com.luv2code.aopdemo.dao.*.get*(..))")
	public void forgetter() {}
	
	@Pointcut("forDAOPackage() && !(forsetter() || forgetter())")
	public void allmethodexceptgetset() {}
	
	
//	@Before("forDAOPackage()")
//	public void beforeAnything() {
//		System.out.println("***** SABSE PEHLE MAI *****");
//	}
	
	@Before("allmethodexceptgetset()")
	public void beforefewthings()
	{
		System.out.println(" SABKE PEHLE MAI (exception)");
	}
}
