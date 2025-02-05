package AnnotationBaseConfig;

import org.springframework.stereotype.Component;

@Component
public class User {

	public User() {
		super();
		System.out.println("User Constuctor called");
	}

	public void m3() {
		System.out.println(" User m3 method call");
	}
	
}
