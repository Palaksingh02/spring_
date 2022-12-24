package com.springdemo.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor ss = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class,ss);
	}
	
	@RequestMapping("/showForm")
	public String showForm(Model model) {
		model.addAttribute("customer", new Customer());
		return "customer-form";
	}
	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("customer") Customer cust , BindingResult theBindingResult) {
		System.out.println("The Customer Information : "+cust.firstName+" "+cust.lastName);	
		if(theBindingResult.hasErrors()) {
			return "customer-form";
		}
		return "customer-confirmation-page";
	}
}