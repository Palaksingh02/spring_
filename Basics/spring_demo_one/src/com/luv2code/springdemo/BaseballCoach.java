package com.luv2code.springdemo;

public class BaseballCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	@Override
	public String getDailyWorkout() {
		return "Spen 30 min on batting practice";
	}
	
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
//	@Override
//	public String getEmailAddress() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	@Override
//	public String getTeam() {
//		// TODO Auto-generated method stub
//		return null;
//	}
	@Override
	public void doMyCleanUpStuff() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void doMyStartUpStuff() {
		// TODO Auto-generated method stub
		
	}
}
