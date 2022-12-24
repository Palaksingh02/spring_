package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {
//	@Before("execution(void com.luv2code.aopdemo.dao.AccountDAO.addAccount())")
//	@Before("execution(void add*(com.luv2code.aopdemo.Account,..))")
	@Before("execution(* com.luv2code.aopdemo.dao.*.*(..))")
	public void beforeAddAccountAdvice() {
		System.out.println("Hello there");
	}
}
