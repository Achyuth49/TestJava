package abstraction;

abstract class Abstract1 {
	
	 Abstract1(){
		System.out.println("Constructor from Abstract1");
	}
	 
	  static void m1() {
		 System.out.println("Static method from Abstract1");
	 }
	  
	 abstract void m2();
	 
	 abstract int add(int a,int b);

}
