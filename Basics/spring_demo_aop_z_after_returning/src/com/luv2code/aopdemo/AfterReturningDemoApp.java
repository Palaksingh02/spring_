package com.luv2code.aopdemo;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.aopdemo.dao.AccountDAO;
import com.luv2code.aopdemo.dao.MembershipDAO;

public class AfterReturningDemoApp {

	public static void main(String[] args) {
		// reading the spring configuration file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		// Get the bean
		AccountDAO theAccountDAO = context.getBean("accountDAO",AccountDAO.class);
		
		List<Account> theAccount = theAccountDAO.findAccounts();
		
		System.out.println("\nMain After Returning App");
		System.out.println("\n\n\n\n");
		System.out.println(theAccount);
		
		// close the context
		context.close();
	}

}
