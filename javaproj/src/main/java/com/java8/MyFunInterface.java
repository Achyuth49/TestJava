package com.java8;

@FunctionalInterface
public interface MyFunInterface {
	
	void m1(); //Single Abstract Method
	
	default void m2() {
		System.out.println("We can have default methods in interface since java 8");
	}
	
	static void m3() {
		System.out.println("We can have static methods in interface since java8");
	}

}
