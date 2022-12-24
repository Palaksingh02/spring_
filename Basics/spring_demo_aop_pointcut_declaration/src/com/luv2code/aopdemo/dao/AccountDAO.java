package com.luv2code.aopdemo.dao;

import org.springframework.stereotype.Component;

import com.luv2code.aopdemo.Account;

@Component
public class AccountDAO {
	
	public void addAccount(Account theAccount) {
		System.out.println(getClass()+"Adding the account in DAO "+"I am from parameter tyoe Account");
	}
//	public void addAccount() {
//		System.out.println(getClass()+"Adding the account in DAO");
//	}

	public void addAccount(Account aa, boolean b) {
		// TODO Auto-generated method stub
		System.out.println(getClass()+"Adding the account in DAO "+"I am from parameter type Account and multiple parameter");
		
	}

	public void doWork() {
		System.out.println("I am doing work");
	}
	
}
