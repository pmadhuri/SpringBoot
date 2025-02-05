package com.springExampleWith_Java;

public class Vodafone implements Sim {

	public static void main(String[] args) {
		Vodafone v=new Vodafone();
		v.calling();
		v.browsing();

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
