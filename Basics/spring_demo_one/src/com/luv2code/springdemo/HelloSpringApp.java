package com.luv2code.springdemo;

//import org.springframework.context.support.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		//Step 1--> Load configuration file

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/luv2code/springdemo/applicationContexxt.xml");
		//Step 2--> Create the spring container
		Coach theCoach = (Coach) context.getBean("myCoach", Coach.class);
		//Step 3--> Retrieve beans from spring container
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		//Step 4--> Call methods on the bean
		context.close();
		//Step 5--> Close the context

	}

}
