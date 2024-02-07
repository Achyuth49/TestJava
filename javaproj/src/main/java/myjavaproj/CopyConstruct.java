package myjavaproj;

public class CopyConstruct {
	
	String name;
	int age;
	
	CopyConstruct(String name,int age){
		this.name = name;
		this.age = age;
	}
	CopyConstruct(CopyConstruct obj){
		this.name = obj.name;
		this.age = obj.age;
	}
	
	public static void main(String[] args) {
		System.out.println("First Object");
		CopyConstruct cc = new CopyConstruct("Achyuth",27);
		System.out.println("First element is :"+cc.name+" "+cc.age);
		System.out.println();
		System.out.println("Second object");
		CopyConstruct cc1 = new CopyConstruct(cc);
		System.out.println("Second element is :"+cc1.name+" "+cc1.age);
	}

}
