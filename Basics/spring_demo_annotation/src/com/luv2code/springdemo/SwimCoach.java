package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {
	//@Autowired
	FortuneService fortuneService;

	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	
	
	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	public String getEmail() {
		return email;
	}
	public String getTeam() {
		return team;
	}
	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "Swim for 1000m for warm up";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	

}
