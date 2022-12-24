package com.luv2code.aopdemo.dao;

import org.springframework.stereotype.Component;

import com.luv2code.aopdemo.Account;

@Component
public class AccountDAO {
	private String name;
	private String serviceCode;
	
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

	public String getName() {
		System.out.println("I am getting name");
		return name;
	}

	public void setName(String name) {
		System.out.println("I am setting name");
		this.name = name;
	}

	public String getServiceCode() {
		System.out.println("I am getting service code");
		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		System.out.println("I am setting service code");
		this.serviceCode = serviceCode;
	}
	
}
