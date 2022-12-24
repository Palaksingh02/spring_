package com.luv2code.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.aopdemo.dao.AccountDAO;
import com.luv2code.aopdemo.dao.MembershipDAO;

public class MainDemoApp {

	public static void main(String[] args) {
		// reading the spring configuration file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		// Get the bean
		AccountDAO theAccountDAO = context.getBean("accountDAO",AccountDAO.class);
		MembershipDAO themembershipDAO = context.getBean("membershipDAO",MembershipDAO.class);
		// call the business method
		Account aa = new Account();
		theAccountDAO.addAccount(aa,true);
		theAccountDAO.doWork();
		themembershipDAO.addAccount();
		themembershipDAO.addSillyMember();
		// close the context
		//theAccountDAO.addAccount();
		context.close();
	}

}
