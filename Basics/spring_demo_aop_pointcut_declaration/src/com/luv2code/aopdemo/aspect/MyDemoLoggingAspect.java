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
	
	@Before("forDAOPackage()")
	public void beforeAddAccountAdvice() {
		System.out.println("Hello there I am from Add Account");
	}
	@Before("forDAOPackage()")
	public void befoeAddAPI() {
		System.out.println("Hello there I am from Add API");
	}
	@Before("forDAOPackage()")
	public void beforeAddCloud() {
		System.out.println("Hello there I am from Add Cloud");
	}
}
