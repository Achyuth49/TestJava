package myjavaproj;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class PractJava {
	int a;
	boolean d;

	public static void main(String[] args) {
		int[] arr1  = {3,8,14,22,2};
		
		for(int i=0;i<arr1.length;i++) {
			
		}
	}

	private static void stringReverse() {
		String name = "Aeroplane";
		char[] stringArray = name.toCharArray();

		for (int i = stringArray.length - 1; i >= 0; i--) {
			System.out.print(stringArray[i]);
		}
		System.out.println("");
		String name1 = "Helicopter";
		StringBuffer sb = new StringBuffer(name1);
		System.out.print(sb.reverse());
	}

	private static void findMissingEleInArr() {
		int[] arr = { 1, 3, 4, 5, 2, 6, 9, 8, 10 };// missing element is 7
		int n = 10;
		int sumOfnNatnum = n * (n + 1) / 2;// sum of n natural numbers
		int sumOfArr = 0;
		for (int i : arr) {
			sumOfArr = sumOfArr + i;
		}
		System.out.println("Sum of array num:" + sumOfArr);
		System.out.println("sum of n num" + sumOfnNatnum);
		System.out.println("Missing num" + (sumOfnNatnum - sumOfArr));// sum of n nat num - sum of array
	}

	private static void mergArrays() {
		int[] arr1 = { 1, 2, 3, 4 };
		int[] arr2 = { 4, 5, 6, 8 };
		int[] arr3 = new int[arr1.length + arr2.length];
		for (int i = 0; i < arr1.length; i++) {
			arr3[i] = arr1[i];
		}
		for (int j = 0; j < arr2.length; j++) {
			arr3[j + arr1.length] = arr2[j];
		}
		System.out.println(Arrays.toString(arr3));
	}

	private static void hashmapPract() {
		Map m = new HashMap();
		m.put(1, "Amit");
		m.put(5, "Suraj");
		m.put(7, "Nikhil");
		m.put(9, "Kenni");

		Set s = m.entrySet();
		Iterator itr = s.iterator();
		while (itr.hasNext()) {
			Map.Entry entry = (Map.Entry) itr.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(100, "Amit");
		map.put(567, "Suraj");
		map.put(789, "Nikhil");
		map.put(909, "Kenni");

		for (Map.Entry e : map.entrySet()) {
			System.out.println(e.getKey() + " " + e.getValue());
		}
	}

	private static void stringBuff() {
		StringBuffer sb = new StringBuffer("Hello");
		sb.append("Achyuth");
		System.out.println(sb);
		sb.insert(2, "WTF");
		System.out.println(sb);
		System.out.println(sb.replace(2, 6, "Kondasani"));
		System.out.println(sb.delete(2, 6));
		System.out.println(sb.reverse());
		System.out.println(sb.capacity());
	}

	private static void stringPract() {
		String s1 = "Achyuth Reddy";
		String s2 = "Nani";
		String s3 = s1 + s2;
		System.out.println(s1);
		System.out.println(s1.concat(s2));
		System.out.println(s1.substring(3, 7));
		String s4 = "449";
		int i = 7749;
		System.out.println(Integer.valueOf(s4));
		System.out.println(String.valueOf(i));
		String s6 = 30 + 20 + "Achyuth" + 20 + 50; // after string lateral all the + will be treated as concatanation
		System.out.println(s6);
	}

	private static void findEvenWithoutCondStat() {
		int n = 4;
		String[] s = { "Even", "Odd" };
		System.out.println(s[n % 2]);
	}

	private static void operatorExam() {
		int a = 20;
		int b = 35;

		System.out.println("Sum " + (a + b));
		System.out.println("Mul" + (a * b));
		System.out.println("div" + (a / b));
		System.out.println("mod" + (a % b));

		if (a != b) {
			System.out.println("false");
		}
	}

	private static void datatypeExam() {
		Scanner s = new Scanner(System.in);
		System.out.println("E" + "nter string");
		String a = s.nextLine();
		try {
			int i = Integer.parseInt(a);
			System.out.println(i);
		} catch (Exception e) {
			System.out.println("Non - numeric string can not be converted into integer");
		}

		byte b = 9;
		double d = (double) b;
		System.out.println(d);

		float f = 5.9f;
		float f1 = 9.12f;
		int q = (int) (f1 / f);
		System.out.println(q);
	}

	private static void varExam() {
		String firstName = "Achyuth";
		String lastName = "Kondasani";
		System.out.println(firstName + " " + lastName);

		char c = 'A';
		int n = c;
		System.out.println(n);

		boolean b = true;
		float f = 3.14f;
		System.out.println(f);
		System.out.println(b);
	}

	static void sumOfSingleDigits() {
		int temp = 789;
		int rem = temp % 9 == 0 ? 9 : temp % 9;
		System.out.println("Sum of sinle digits :" + rem);
	}

}
