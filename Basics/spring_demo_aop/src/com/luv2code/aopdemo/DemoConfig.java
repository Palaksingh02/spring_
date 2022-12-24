package com.luv2code.aopdemo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration // Spring pure java configuration file
@EnableAspectJAutoProxy  // Spring AOP Proxy Support
@ComponentScan("com.luv2code.aopdemo") // Component Scan for packages
public class DemoConfig {

}
