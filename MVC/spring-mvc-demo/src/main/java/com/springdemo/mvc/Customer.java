package com.springdemo.mvc;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Customer {
	public String firstName;
	
	@NotNull(message="*is Required")
	@Size(min=1,message="*is Required")
	public String lastName;
	
	@Min(value=0,message="Must be greater than zero")
	@Max(value=10,message="Must be less than ten")
	public Integer freePasses;
	
	@Pattern(regexp="^[a-zA-Z0-9]{5}",message="only 5 digit.character allowed")
	public String postalCode;
	
	@CourseCode(value="IT",message="Should start as desired")
	public String courseCode;

	public Customer() {
		
	}
	
	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
	public Integer getFreePasses() {
		return freePasses;
	}

	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
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
