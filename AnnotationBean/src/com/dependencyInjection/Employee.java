package com.dependencyInjection;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


public class Employee {

	public Employee() {
		super();
		System.out.println("Employee Constuctor called");
	}
    @Bean
	public void m2() {
		System.out.println(" Employee m2 method call");
	}
	
}
