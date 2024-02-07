package myjavaproj;

import java.util.Scanner;

public class Pract {

	public static void main(String[] args) {
		
	}

	private static void ifExam() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age");
		int age = sc.nextInt();
		System.out.println("Enter Male(M) or Female(F)");
		char gen = sc.next().charAt(0);
		sc.close();
		if(gen == 'F' || gen == 'f') {
			if(age >= 18) {
				System.out.println("You are a Woman");
			}else {
				System.out.println("You are a girl");
			}
		}else if(gen == 'M' || gen == 'm') {
			if(age >= 18) {
				System.out.println("You are a Man");
			}else {
				System.out.println("You are a boy");
			}
		}
	}

	private static void switchExamp() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int dayNum = sc.nextInt();
		sc.close();
		String day;
		switch(dayNum) {
		case 1: day = "Monday";break;
		case 2: day = "Tues";break;
		case 3: day = "Wed";break;
		case 4: day = "Thurs";break;
		case 5: day = "Fri";break;
		case 6: day = "Sat";break;
		case 7: day = "Sun";break;
		default: day = "Invalid Number";break;
		}
		System.out.println("The day is :"+day);
	}

	private static void datatypeTest() {
		char ch = 'A';
		ch++;
		System.out.println(ch);
		char c1 = '1';
		char c2 = '2';
		char c3 = (char)(c1+c2);
		System.out.println(c3);
		int a = 6;
		int b = a++;
		int c = ++a;
		System.out.println(a+b+c);
		
		boolean flag = false;
		if(flag=true) {
			System.out.println("True");
		}
		
		int x=5,y=10;
		if(x>3||y<10&&x>y) {
			System.out.println("f");
		}else {
			System.out.println("T");
		}
	}

}
