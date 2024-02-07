package myjavaproj;

import java.io.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class mypract {
	static String s = "Static Variable";
	
	public Integer add(Integer a, Integer b) {
		return a+b;
	}
	
	private static boolean x;
	public static void main(String[] args) {
		
		demo obj1=new demo();
		demo obj2=obj1;
		obj1.a += 1;
		obj1.b += 1;
		obj1.print();
		obj2.print();
	}
	static int sum(int... data) {
		int res=0;
		for(int x:data)
			res =res+x;
		return res;
	}
	private static void stringpra() {
		String str = "Achyuth";
		str = str.concat("Reddy");
		System.out.println(str);
		
		StringBuffer sb =  new StringBuffer();
		sb.append("This is ");
		sb.append("String buffer ");
		sb.append("example");
		System.out.println(sb);
		String mes = sb.toString();
		System.out.println(mes);
		int[] arr = {10,20,49,38,42};
		int highest_num = maximum(arr);
		System.out.println("Highest num is :"+highest_num);
	}
	public static int maximum(int[] number) {
		int maxSoFar = number[0];
		for(int num : number) {
			if(num>maxSoFar) {
				maxSoFar= num;
			}
		}
		return maxSoFar;
	}

	private static void switchExamp() {
		int day = 10;
		
		switch(day) {
		case 1:
			System.out.println("Mon");
			break;
		case 2:
			System.out.println("Tues");
			break;
		case 3:
			System.out.println("Wed");
			break;
		case 4:
			System.out.println("Thurs");
			break;
		case 5:
			System.out.println("Fri");
			break;
		case 6:
			System.out.println("Sat");
			break;
		case 7:
			System.out.println("Sun");
			break;
		default : System.out.println("Invalid number");
		
		}
	}

	private static void formatting() {
		int a = 10000;
		System.out.printf("%,d%n",a);//%,d fromat  numbers separated by comma
		//%n - for new line
		double d = 123.49876;
		System.out.printf("%f%n",d);
		System.out.printf("%5.3f%n",d);
		System.out.printf("%8.3f%n",d);
		boolean b = true;
		System.out.printf("%b%n",b);
		System.out.printf("%B%n",b);
		
		int yr = 0;
		int mon = 0;
		int day = 0;
		Date time = new Date(yr, mon, day);
		
		System.out.printf("Current time :%tT%n",time);
	}

	private static void bfnPract() {
		BufferedReader bfn = new BufferedReader(new InputStreamReader(System.in));
		String name;
		int age;
		try {
			System.out.println("Enter your name");
			name = bfn.readLine();
			System.out.println("Enter your age");
			age = Integer.parseInt(bfn.readLine());
			System.out.println("Your name is :"+name);
			System.out.println("Your age is :"+age);
		}catch(Exception e) {}
	}

	private static void datatypeprat() {
		//variables declared inside main are local var
		System.out.println(s);
	char c = 'A';
	Character ch  = c; //Autoboxing-primitive to wrapper
	System.out.println(ch);
	
	ArrayList<Integer> al = new ArrayList<>();
	al.add(49);//autoboxing - arraylist can store only objects
	System.out.println(al.get(0)); 
	
	int i = 20;
	Integer in = new Integer(i);
	float f = 7.49f;
	Float fl = new Float(f);
	double d = 49.7;
	Double db = new Double(d);
	}

	static void varMethod() {
		//static int a=0; //static var should not declare inside methods
	}
}
