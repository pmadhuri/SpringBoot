package com.dependencyInjection_with_Java;

public class Test {

	public static void main(String[] args) {
		//1   Parameterised Constructor
	//	Student s=new Student(1, "madhuri", "Pune");
		
		
		//2   setters and getters
		Student s1=new Student();
		s1.setSadd("mumbai");
		s1.setSid(2);
		s1.setSname("sandip");
		System.out.println(s1);

	}

}
