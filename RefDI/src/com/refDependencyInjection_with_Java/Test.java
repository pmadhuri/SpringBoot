package com.refDependencyInjection_with_Java;

public class Test {

	public static void main(String[] args) {
		//1   Parameterised Constructor
	//	Student s=new Student(1, "madhuri", "Pune");
		
		
		//2   setters and getters
		 //Address class
	       Address a=new Address();
	       a.setAreaName("DC");
	       a.setCityName("Pune1");
	   	//Student  class
	       Student s1=new Student();
		   s1.setSid(2);
		   s1.setSname("sandip");
		   s1.setSadd(a);
		   System.out.println(s1);

	}

}
