package com.java8;

public class TestInterface implements MyFunInterface{

	@Override
	public void m1() {
		System.out.println("Abstract method implemented");
	}
	
	public static void main(String[] args) {
		TestInterface t = new TestInterface();
		t.m1();
		t.m2();//default method in interface
		MyFunInterface.m3();//static method calling with interface name
	}

}
