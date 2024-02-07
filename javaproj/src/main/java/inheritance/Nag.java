package inheritance;

public class Nag extends ANR{
	
	int debts = 545;
	
	public static void main(String[] args) {
		ANR n1 = new Nag();
		Nag n = new Nag();
		//n.bb();
		//n.starMaa();
		n.studio();
		n.house();
		n.debts();
		//n1.m1();
		m1();
	}
	
	void bb() {
		System.out.println("Bigg boss show");
	}
	
	void starMaa() {
		this.bb();// this calls current class var, methods
		System.out.println("Star maa tv partnership");
	}
	
	Nag(){
		super(1000);// super calls parent class var, methods 
		this.starMaa();
		System.out.println("Constructor from Nag class");
	}
	void debts() {
		System.out.println("Debts from ANR :"+super.debts);
		System.out.println("Debts from Nag :"+this.debts);
	}
	
	public static void m1() {
		System.out.println("This is child static method");
	}

}
