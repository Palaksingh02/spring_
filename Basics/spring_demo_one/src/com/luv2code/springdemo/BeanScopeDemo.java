package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemo{

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/luv2code/springdemo/bean_scope_applicationContext.xml");
		
		/*
		 * By default the scope of bean is singleton which means all the requests for the bean are returned a shared bean address
		 * But we can implicitly change the scope of the bean 
		 * By prototype every instance a bean is referred a new instance is created  
		 * 
		 */
		
		Coach alpha = context.getBean("myCoach",Coach.class);
		
		Coach beta = context.getBean("myCoach",Coach.class);
		
		boolean result = (alpha==beta);
		
		System.out.println("They refer to the same memory address:"+result);
		
		System.out.println("Address of alpha: "+alpha);
		
		System.out.println("Address of beta: "+beta);
	}

}
