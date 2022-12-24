package com.luv2code.aopdemo;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.aopdemo.dao.AccountDAO;
import com.luv2code.aopdemo.dao.MembershipDAO;

public class AfterThrowingDemoApp {

	public static void main(String[] args) {
		// reading the spring configuration file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		// Get the bean
		AccountDAO theAccountDAO = context.getBean("accountDAO",AccountDAO.class);
		
		List<Account> theAccount = null;
		
		try {
			boolean flag = true;
			theAccount = theAccountDAO.findAccounts(flag);
		}
		catch(Exception e){
			System.out.println("\n\nMain Program exception ........."+e);
		}
		
		System.out.println("\nMain After Throwing App");
		System.out.println("\n\n");
		System.out.println(theAccount);
		
		// close the context
		context.close();
	}

}
