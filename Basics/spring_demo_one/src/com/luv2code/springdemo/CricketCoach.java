package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	// The dependency interface
	public FortuneService fortune;
	
	private String emailAddress;
	private String team;
	
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public CricketCoach() {
		System.out.println("No arg-method constructor");
	}
	// The setter method that is setter dependency injection 
	// --> the setfortuneService is invoked by the property tag let's say 
	// <property name="fortuneService> --> this will ultimately look for setFortuneService() 
	public void setfortuneService(FortuneService fortune) {
		this.fortune = fortune;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortune.getFortune();
	}
	@Override
	public void doMyCleanUpStuff() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void doMyStartUpStuff() {
		// TODO Auto-generated method stub
		
	}

}
