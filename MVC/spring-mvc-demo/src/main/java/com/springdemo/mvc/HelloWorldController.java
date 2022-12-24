package com.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloWorldController {

	//need a controller method to show the form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	//need a controller method to process the form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	@RequestMapping("/processFormVersionTwo")
	public String processFormVersionTwo(HttpServletRequest request , Model model) {
		
		String theName = request.getParameter("studentName");
		
		theName = theName.toUpperCase();
		
		String mes = "Yo! Two"+theName;
		
		model.addAttribute("message", mes);
		
		return "helloworld";
	}
	
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(@RequestParam("studentName")String theName , Model model) {
		
		
		theName = theName.toUpperCase();
		
		String mes = "Yo! from V3 "+theName;
		
		model.addAttribute("message", mes);
		
		return "helloworld";
	}
	
}
