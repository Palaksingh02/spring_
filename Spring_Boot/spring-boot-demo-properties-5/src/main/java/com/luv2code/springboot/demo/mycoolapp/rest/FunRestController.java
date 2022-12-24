package com.luv2code.springboot.demo.mycoolapp.rest;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
	@Value("${coach.name}")
	private String name;
	
	@Value("${coach.team}")
	private String team;
	
	@GetMapping("/")
	public String showMessage() {
		return "Hello world \n So the current time is "+LocalDateTime.now();
	}
	
	@GetMapping("/workout")
	public String showWorkout() {
		return "Start your workout at time : "+LocalDateTime.now();
	}
	
	@GetMapping("/break")
	public String takeBreak() {
		return "Take break at time : "+LocalDateTime.now();
	}
	
	@GetMapping("/contact")
	public String whoAreU() {
		return "I am "+name+"and I am from"+team;
	}
}
