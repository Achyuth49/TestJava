package inheritance;

public class ANR {

	int debts = 125;
	
	public static void m1() {
		System.out.println("This is static method in parent class");
	}
	
	void studio() {
		System.out.println("Annapurna Studios");
	}
	
	void house() {
		System.out.println("Farmhouse in Jubilee hills");
	}
	
	ANR(){
		System.out.println("Constructor from ANR class");
	}
	ANR(int bankBal){
		System.out.println("ANR bank balance is :"+bankBal);
	}

}
