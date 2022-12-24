package com.luv2code.springdemo;

//dependency class implementing the dependency interface
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is your lucky day";
	}

}
