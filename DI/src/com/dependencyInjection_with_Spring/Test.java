package com.dependencyInjection_with_Spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		//1  dependency injection by using setter injection.*********property*** tag in beans.xml
		//o/p          Student [sid=12, sname=tanvi, sadd=pune]
		
		 //2  Constructor injection.                    *********constructor-arg**** tag in beans.xml
		//o/p  constructor called
		//Student [sid=12, sname=tanvi, sadd=pune]
ClassPathXmlApplicationContext apc=new ClassPathXmlApplicationContext("beans.xml");
Student s=apc.getBean("student",Student.class);
System.out.println(s);
Student s1=apc.getBean("student",Student.class);


	}

}
