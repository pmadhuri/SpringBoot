package com.springExampleWith_Spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Jio implements Sim{

	public static void main(String[] args) {
		//ClassPathXmlApplicationContext apc=new ClassPathXmlApplicationContext("beans.xml");
	}

	@Override
	public void calling() {
		System.out.println("calling via Jio");
		
	}

	@Override
	public void browsing() {
		System.out.println("browsing via Jio");
		
	}

	public Jio() {
		super();
		System.out.println(" jio constructor ");
	}
	

}
