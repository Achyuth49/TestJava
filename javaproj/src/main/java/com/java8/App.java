package com.java8;

public class App {
	
	public static void main(String[] args) {
		
		//No Parameters
		MyFunInterface m = ()->{System.out.println("m1 method in Fun Inter overridden using lambda exp");};
		m.m1();
		
		
	// Parameterized
		MyFunInt2 lm = (a,b)->{
			System.out.println("Sum of 2 num is: "+(a+b));
		};
		lm.m2(10,20);
	}
	
		
}
