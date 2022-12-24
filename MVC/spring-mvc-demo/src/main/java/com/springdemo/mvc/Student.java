package com.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {
	public String firstName;
	public String lastName;
	
	public String country;
	
	public LinkedHashMap<String,String> countryOptions;
	
	public String favoriteLanguage;
	
	public LinkedHashMap<String,String> languageOptions;
	
	public String[] operatingSystem;
	
	public Student() {
		countryOptions = new LinkedHashMap<String,String>();
		
		countryOptions.put("BR", "Brazil");
		countryOptions.put("IN", "India");
		countryOptions.put("GE", "Germany");
		countryOptions.put("FR", "France");
		countryOptions.put("US", "United States of America");
		
		languageOptions = new LinkedHashMap<String,String>();
		languageOptions.put("C++","C++");
		languageOptions.put("Java","JAVA");
		languageOptions.put("C#","C#");
		languageOptions.put("Ruby","RUBY");
		languageOptions.put("PHP","PHP");
	}
	
	public String[] getOperatingSystem() {
		return operatingSystem;
	}


	public void setOperatingSystem(String[] operatingSystem) {
		this.operatingSystem = operatingSystem;
	}


	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}


	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}


	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public LinkedHashMap<String, String> getLanguageOptions() {
		return languageOptions;
	}


	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}
