package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemo {

	public static void main(String[] args) {
		
		/*
		 For checking the scope of the bean we simply add the @Scope annotation with the type of scope
		 @Scope("prototype")
		 */
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContexxt.xml");
		
		Coach theCoach = context.getBean("tennisCoach",Coach.class);
		
		Coach alpha = context.getBean("tennisCoach",Coach.class);
		
		System.out.println("Same address : "+(alpha==theCoach));
		
		System.out.println("Address of the fist bean : "+theCoach);
		
		System.out.println("Address of the second bean : "+alpha);
	}

}
