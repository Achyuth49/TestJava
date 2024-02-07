package myjavaproj;

public class StringPract {
	
	char c='6';
	char c1 = 66;
	int n3 = 90;
	
	public static void main(String[] args) {
		
		StringPract sp = new StringPract();
		
		System.out.println(sp.c1);// 66 ascii num of B
		System.out.println(sp.c); // takes 6 as char
		
		
		String s= "7449";
		int n = Integer.parseInt(s);
		System.out.println("Converted to integer :"+n);
		
		int n1 = 497;
		
	String s1 = Integer.toString(n1);
	System.out.println("Converted to string :"+s1);
	}

}
