package com.springdemo.mvc;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeContraintValidator implements ConstraintValidator<CourseCode,String> {
	private String[] prefixes;

	@Override
	public void initialize(CourseCode courseCode) {
		prefixes = courseCode.value();
	}
	
	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext cc) {
		if(theCode!=null) {
			for(String prefix : prefixes) {
				if(theCode.startsWith(prefix)) {
					return true;
				}
			}
		}
		else {
			return true;
		}
		return false;
	}

}
