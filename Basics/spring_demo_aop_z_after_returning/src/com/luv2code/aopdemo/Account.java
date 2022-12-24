package com.luv2code.aopdemo;

public class Account {
	private String name;
	private String label;
	
	
	
	public Account() {
		
	}
	
	public Account(String name, String label) {
		this.name = name;
		this.label = label;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getLabel() {
		return label;
	}
	
	public void setLabel(String label) {
		this.label = label;
	}

	@Override
	public String toString() {
		return "Account [name=" + name + ", label=" + label + "]";
	}
	
	
}
