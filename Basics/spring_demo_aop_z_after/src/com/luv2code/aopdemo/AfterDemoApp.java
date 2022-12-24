package com.luv2code.aopdemo;


import java.util.logging.Logger;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.aopdemo.dao.AccountDAO;
import com.luv2code.aopdemo.dao.MembershipDAO;
import com.luv2code.aopdemo.service.TrafficService;

public class AfterDemoApp {
	
	//private static Logger mylogger = Logger.getLogger(AfterDemoApp.class.getName()); 

	public static void main(String[] args) {
		// reading the spring configuration file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		// Get the bean
		TrafficService theTrafficService = context.getBean("trafficService",TrafficService.class);
		
		boolean tripWire = true;
		String result = theTrafficService.getDelay(tripWire);
		
		System.out.println(result);

		context.close();
	}

}
