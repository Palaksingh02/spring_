package com.luv2code.aopdemo.aspect;

import java.util.List;
import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.luv2code.aopdemo.Account;

@Aspect
@Component
@Order(2)
public class MyDemoLoggingAspect {
	
	private Logger mylogger = Logger.getLogger(MyDemoLoggingAspect.class.getName()); 
	
	@Around("execution(* com.luv2code.aopdemo.service.*.getDelay(..))")
	public Object aroundDelay(ProceedingJoinPoint theProceedingJoinPoint) throws Throwable{
		String method = theProceedingJoinPoint.getSignature().toShortString();
		System.out.println("Method : "+method);
		
		long begin = System.currentTimeMillis();
		
		//for the simple exection
		//Object result = theProceedingJoinPoint.proceed();
		
		//I would be using the @Around advice to handle the exception
		
		Object result = null;
		try {
			
			result = theProceedingJoinPoint.proceed();
		} catch (Throwable e) {
			//log the exception
			mylogger.warning(e.getMessage());
			// a user defined message
			
			throw e;
			// Re-throwing the exception to the main program
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println("Duration is "+(end-begin)/1000);	
		
		System.out.println("I am from around advice");
		return result;
	}
	
	// Adding a new advice for after returning on findAccounts()
	@After("execution(* com.luv2code.aopdemo.dao.AccountDAO.findAccounts(..))")
	public void afterFindAccountAdvice(JoinPoint theJoinPoint) {
		String method = theJoinPoint.getSignature().toShortString();
		System.out.println("Method : "+method);
		System.out.println("I am executing from after advice");
	}
	@AfterThrowing(
			pointcut="execution(* com.luv2code.aopdemo.dao.AccountDAO.findAccounts(..))",
			throwing="exc")
	public void throwingFindAccountAdvice(JoinPoint theJoinPoint , Exception exc) {
		String method = theJoinPoint.getSignature().toShortString();
		
		System.out.println("Method : "+method);
		
		System.out.println("The exceptions is :"+exc);
		
		System.out.println("\nI am from after throwing block\n");
	}
	
	@AfterReturning(
			pointcut="execution(* com.luv2code.aopdemo.dao.AccountDAO.findAccounts(..))",
			returning="result")
	public void afterFindAccountAdvice(JoinPoint theJoinPoint , List<Account> result) {
		String method = theJoinPoint.getSignature().toShortString();
		
		
		System.out.println("Method : "+method);
		
		System.out.println("The result is : "+result);
		
		convertToUpperCase(result);
		
		System.out.println("The result is : "+result);
		
		System.out.println("\n I am returning after the successful execution of method");
	}
	
	private void convertToUpperCase(List<Account> result) {
		for(Account temp : result) {
			String up = temp.getName().toUpperCase();
			temp.setName(up);
		}
	}

	@Before("com.luv2code.aopdemo.aspect.Luv_aop_aspect.allmethodexceptgetset()")
	public void beforefewthings(JoinPoint thejoinpoint)
	{
		System.out.println("=====>>>>> LOGGING ASPECT");
//		MethodSignature methodSig = (MethodSignature) thejoinpoint.getSignature();
//		
//		System.out.println("Method = "+methodSig);
//		
//		Object[] args = thejoinpoint.getArgs();
//		
//		for(Object temp : args) {
//			System.out.println(temp);
//		}
	}
	
	
	
	
}
