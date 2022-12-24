package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemo{

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/luv2code/springdemo/bean_lifeCycle_applicationContext.xml");
		
		
		Coach alpha = context.getBean("myCoach",Coach.class);
		System.out.println(alpha.getDailyFortune());
		System.out.println(alpha.getDailyWorkout());
		// If the scope of the bean is prototype then Spring does not calls for the destroy method #VERIFIED
		context.close();
	}

}
