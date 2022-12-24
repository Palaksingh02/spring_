package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.luv2code.springdemo") // When we are defining the bean explicitly then we don't need to scan the entire package
@PropertySource("classpath:com/luv2code/springdemo/sport.properties")
public class SportConfig {
	@Bean
	public FortuneService myFortuneService() {
		return new RandomFortuneService();
	}
	
	@Bean
	public Coach swimCoach() { // swimCoach is the bean ID
		SwimCoach mySwimCoach = new SwimCoach(myFortuneService());
		return mySwimCoach;
	}
}
