package com.luv2code.springsecurity.demo.config;

import java.beans.PropertyVetoException;
import java.util.logging.Logger;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages="com.luv2code.springsecurity.demo")
@PropertySource("classpath:persistence-mysql.properties")
public class DemoAppConfig {
	
	@Autowired
	public Environment env;
	
	private Logger myLogger = Logger.getLogger(getClass().getName());
	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver v = new InternalResourceViewResolver();
		v.setPrefix("/WEB-INF/view/");
		v.setSuffix(".jsp");
		return v;
	}
	
	@Bean
	public DataSource securityDataSource() {
		
		//create connection pool
		ComboPooledDataSource securityDataSource = new ComboPooledDataSource();
		
		
		//set the jdbc driver
		try {
			securityDataSource.setDriverClass(env.getProperty("jdbc.driver"));
			System.out.println("\n\n\n\n\n ******************\n\\n\\n\\n\\n ");
		} catch (PropertyVetoException e) {
			// TODO Auto-generated catch block
			System.out.println("\n\n\n\n\n ##################\n\\n\\n\\n\\n ");
			throw new RuntimeException(e);
		}
		
		//log the connection probs
		myLogger.info(">>>>jdbc.url  =  "+env.getProperty("jdbc.url"));
		myLogger.info(">>>>jdbc.user =  "+env.getProperty("jdbc.user"));
		myLogger.info(">>>>jdbc.password =  "+env.getProperty("jdbc.user"));

		myLogger.info("-----------> env connection.pool.initialPoolSize =  "
				+ env.getProperty("connection.pool.initialPoolSize"));
		myLogger.info(
				"-----------> env connection.pool.minPoolSize =  " + env.getProperty("connection.pool.minPoolSize"));
		myLogger.info(
				"-----------> env connection.pool.maxPoolSize =  " + env.getProperty("connection.pool.maxPoolSize"));
		myLogger.info("-----------> env connection.pool.connection.pool.maxIdleTime =  "
				+ env.getProperty("connection.pool.maxIdleTime"));
		
		
		//set the database connection probs
		
		securityDataSource.setJdbcUrl(env.getProperty("jdbc.url"));
		securityDataSource.setUser(env.getProperty("jdbc.user"));
		securityDataSource.setPassword(env.getProperty("jdbc.password"));
		
		//set the connection pool probes
		
		securityDataSource.setInitialPoolSize(Integer.parseInt(env.getProperty("connection.pool.initialPoolSize")));
		securityDataSource.setMinPoolSize(Integer.parseInt(env.getProperty("connection.pool.minPoolSize")));
		securityDataSource.setMaxPoolSize(Integer.parseInt(env.getProperty("connection.pool.maxPoolSize")));
		securityDataSource.setMaxIdleTime(Integer.parseInt(env.getProperty("connection.pool.maxIdleTime")));
		/*
		 * connection.pool.initialPoolSize=5
		   connection.pool.minPoolSize=5
		   connection.pool.maxPoolSize=20
 		   connection.pool.maxIdleTime=3000*/
		
		return securityDataSource;
	}
	
	
	
}
