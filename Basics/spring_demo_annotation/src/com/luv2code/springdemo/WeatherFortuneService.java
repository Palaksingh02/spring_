package com.luv2code.springdemo;
import org.springframework.stereotype.Component;

@Component
public class WeatherFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today's weather is not good";
	}

}
