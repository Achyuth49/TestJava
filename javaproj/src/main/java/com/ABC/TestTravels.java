package com.ABC;

import java.io.FileInputStream;
import java.util.*;

public class TestTravels {
		
	public static void main(String[] args) {
		ABCTravels t = new ABCTravels();
		try {
			FileInputStream fin = new FileInputStream("banner.txt");
			int i=0;
			while((i=fin.read())!=-1) {
				System.out.print((char)i);
			}
			fin.close();
		}catch(Exception e) {
			System.out.println("File not found");
		}
		
		System.out.println(" ");
		
		System.out.println(" ");
		System.out.println("1.User Resistration");
		System.out.println("2.Lock Account");
		System.out.println("3.Plan Journey");
		System.out.println(" ");
		Scanner s = new Scanner(System.in);
		System.out.println("Please select any option :");
		int option = s.nextInt();
		if(option == 1) {
			t.userRegistration();
		}
		
		
	}

}
