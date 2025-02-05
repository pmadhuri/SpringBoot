package com.springExampleWith_Java;

public class Jio implements Sim{

	public static void main(String[] args) {
		Jio j=new Jio();
		j.browsing();
		j.calling();

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
