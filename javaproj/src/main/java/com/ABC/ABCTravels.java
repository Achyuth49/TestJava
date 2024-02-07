package com.ABC;

import java.util.ArrayList;
import java.util.Scanner;

public class ABCTravels {
	
	void userRegistration() {
		ArrayList<String> userList = new ArrayList<>();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter First Name");
		String fName = s.nextLine();
		userList.add(fName);
		System.out.println("Enter Last Name");
		String lName = s.nextLine();
		userList.add(lName);
		System.out.println("Enter Mobile Number");
		String mobNum = s.nextLine();
		while(mobNum.length()<10 || mobNum.length()>10) {
			System.out.println("Enter Valid Number");
			 mobNum = s.nextLine();
		}
		userList.add(mobNum);
		System.out.println("Enter Gender - M/F");
		String gen = s.nextLine();
		userList.add(gen);
		System.out.println("Enter Email-Id");
		String mail = s.nextLine();
		userList.add(mail);
		System.out.println("Enter Password");
		String pWord = s.nextLine();
		userList.add(pWord);
		s.close();
		System.out.println(" ");
		System.out.println("Hello "+fName+" your registration is succesfull");
		System.out.println("");
		for(Object obj: userList) {
			System.out.println(obj);
		}
		
	}

}
