package com.luv2code.springsecurity.demo.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;

@Configuration
@EnableWebSecurity
public class ClassDemoSecurityConfig extends WebSecurityConfigurerAdapter {

	// add reference to our datasource
	@Autowired
	public DataSource securityDataSource;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.jdbcAuthentication().dataSource(securityDataSource);
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception { // configure spring security
		
		http.authorizeRequests()  // Restricts access based on the HttpServletRequest
			.anyRequest().authenticated() // Any request to the app must be authenticated
			.and().formLogin() // We are customizing the login form
			.loginPage("/showMyLoginForm") // Show our custom login form at the request mapping
			.loginProcessingUrl("/authenticateTheUser") // Login form should post the data to this URL for processing
			.permitAll() // All the users can see the login form
			.and()
			.logout().permitAll();
	}
	

	
}
