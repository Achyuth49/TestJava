package polymorphism;

public class Calculator {
	
	int multiply(int a,int b) {
		return a*b;
	}
	
	int multiply(int a, int b, int c) { //method overload
		return a*b*c;
	}

	public static void main(String[] args) {
		Calculator ct = new Calculator();
		System.out.println(ct.multiply(12, 6));
		System.out.println(ct.multiply(2, 5, 8));
	}

}
