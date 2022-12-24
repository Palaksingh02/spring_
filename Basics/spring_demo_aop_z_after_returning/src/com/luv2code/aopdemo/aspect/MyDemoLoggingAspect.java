package com.luv2code.aopdemo.aspect;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
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
	
	// Adding a new advice for after returning on findAccounts()
	
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
