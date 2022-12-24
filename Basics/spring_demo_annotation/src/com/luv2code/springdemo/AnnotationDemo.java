package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContexxt.xml");
		
//		Coach theCoach = context.getBean("thatSillyCoach",Coach.class);
		Coach theCoach = context.getBean("tennisCoach",Coach.class); // Default bean ID class name
		
		System.out.println(theCoach.getDailyWorkOut());
		
		System.out.println(theCoach.getDailyFortune());
		
		context.close();
	}

}
