package com.springExampleWith_Spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Vodafone implements Sim {

	public static void main(String[] args) {
	//	ClassPathXmlApplicationContext apc=new ClassPathXmlApplicationContext("beans.xml");

	}

	@Override
	public void calling() {
		System.out.println("calling via Vodafone");
		
	}

	@Override
	public void browsing() {
		System.out.println("browsing via voafone");
		
	}

	public Vodafone() {
		super();
		System.out.println(" vodafone constructor ");
	}

}
