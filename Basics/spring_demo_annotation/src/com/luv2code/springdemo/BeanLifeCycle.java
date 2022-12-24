package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycle {

	public static void main(String[] args) {
		/*
		 * We have implemented the init() method ----> @PostCnstruct annotation
		 * We have implemented the destroy() method ----> @PreDestroy annotation
		 */
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContexxt.xml");
		
		Coach theCoach = context.getBean("tennisCoach",Coach.class);
		
		System.out.println(theCoach.getDailyFortune());
		
		System.out.println(theCoach.getDailyWorkOut());
		
		context.close();
	}

}
