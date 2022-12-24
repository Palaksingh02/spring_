package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("thatSillyCoach") //Spring will automatically register this bean with bean ID = thatSillyCoach
@Component
//@Scope("prototype")
public class TennisCoach implements Coach { //If we don't provide the bean id explicitly by default class in first letter lower case (tennisCoach)
	
// Field Injection 
//	@Autowired // This is for injecting dependencies through annotations
//	@Qualifier("sadFortuneService") // If the dependency classes are more than one then spring is confused so qualifier is added to stop the confusion
	FortuneService fortuneService;
	
	public TennisCoach(){
		System.out.println("Ayee Ayee Captain");
	}
// Setter Dependency Injection		
//	@Autowired
//	public void setFortuneService(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}
	
// Constructor Dependency Injection	
//	@Autowired
//	public TennisCoach(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}
	
// Constructor dependency Injection using qualifier
	@Autowired
	public TennisCoach(@Qualifier("sadFortuneService")FortuneService fortuneService) { // Implementation of qualifier is quite different for constructor 
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkOut() {
		return "Practice ball for 15 minutes";
	}
	
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	/*
	 * When using Java 9 and higher, javax.annotation has been removed from its default classpath 
	 * Java.annnotation contains the @PostConstruct and @PreDestroy annotation 
	 */
	
	// defined my init method
	@PostConstruct
	public void doMyStartUpStuff() {
		System.out.println("I am starting up");
	}
	
	// defined my destroy method
	@PreDestroy
	public void doMyCleanUpStuff() {
		System.out.println("I am shutting down");
	}
}
