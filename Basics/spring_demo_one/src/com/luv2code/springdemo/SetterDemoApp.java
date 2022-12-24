package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		//creating the spring container and adding the configuration file 
		// Very Important // Always write name from package level for the configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/luv2code/springdemo/applicationContexxt.xml");
		
		CricketCoach theCoach = context.getBean("myCricketCoach",CricketCoach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());

		System.out.println(theCoach.getEmailAddress());
		
		System.out.println(theCoach.getTeam());
		
		context.close();
	}

}
