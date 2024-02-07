package abstraction;

public class TestAbs extends Abstract1{
	
	

	@Override
	void m2() {
		System.out.println("Implemented m2 abs method");
	}

	@Override
	int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	public static void main(String[] args) {
		
		TestAbs t1 = new TestAbs();
		t1.m2();
		System.out.println(t1.add(49, 7));
		Abstract1.m1();
		
	}

}
