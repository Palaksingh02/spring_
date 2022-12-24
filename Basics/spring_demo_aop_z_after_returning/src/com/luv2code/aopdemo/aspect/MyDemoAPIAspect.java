package com.luv2code.aopdemo.aspect;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(3)
public class MyDemoAPIAspect {
	
	@Before("com.luv2code.aopdemo.aspect.Luv_aop_aspect.allmethodexceptgetset()")
	public void beforeAgain()
	{
		System.out.println("=====>>>>> API ASPECT");
	}
}
