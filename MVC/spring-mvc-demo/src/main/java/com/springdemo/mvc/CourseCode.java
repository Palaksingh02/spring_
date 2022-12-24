package com.springdemo.mvc;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import javax.validation.Constraint;
import javax.validation.Payload;


@Constraint(validatedBy = CourseCodeContraintValidator.class)
@Target({ ElementType.FIELD, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {
	public String[] value() default {"LUV"};
	public String message() default "must start with LUV";
	public Class<?>[] groups() default {};

	public Class<? extends Payload>[] payload() default {};
	//String value();
}
