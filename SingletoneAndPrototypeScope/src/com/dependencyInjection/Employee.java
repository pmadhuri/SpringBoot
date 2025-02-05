package com.dependencyInjection;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("Singletone")
public class Employee {

	public Employee() {
		super();
		System.out.println("Employee Constuctor called");
	}

	public void m2() {
		System.out.println(" Employee m2 method call");
	}
	
}
