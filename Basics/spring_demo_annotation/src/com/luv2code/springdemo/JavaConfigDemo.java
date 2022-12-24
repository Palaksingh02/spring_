package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemo {

	public static void main(String[] args) {
		/*
		 * To read the configurations from java source code itself we use AnnotationConfigApplicationContext
		 */
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
//		Coach theCoach = context.getBean("thatSillyCoach",Coach.class);
//		Coach theCoach = context.getBean("tennisCoach",Coach.class); // Default bean ID class name // Component Scanning the entire package
		SwimCoach theCoach = context.getBean("swimCoach",SwimCoach.class);
		
		System.out.println(theCoach.getDailyWorkOut());
		
		System.out.println(theCoach.getDailyFortune());
		
		System.out.println("Email ID : "+theCoach.getEmail());
		
		System.out.println("Team : "+theCoach.getTeam());
		
		context.close();
	}

}
