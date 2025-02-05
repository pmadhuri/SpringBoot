package com.dependencyInjection;

import org.springframework.stereotype.Component;

@Component
public class Employee {

	public Employee() {
		super();
		System.out.println("Employee Constuctor called");
	}

	public void m2() {
		System.out.println(" Employee m2 method call");
	}
	
}
