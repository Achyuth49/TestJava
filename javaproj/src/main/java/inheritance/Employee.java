package inheritance;

public class Employee {
	
	int id;
	String name;
	Address address;
   int myVar = 10;
   
	
	Employee(int id, String name, Address address){
		
		this.id = id;
		this.name = name;
		this.address = address;
		
	}

	public static void main(String[] args) {
		Address addr1 = new Address("Guntur","AP",522004);
		Address addr2 = new Address("Hyderabad","TS",500081);
		
		Employee emp1 = new Employee(100,"Achyuth",addr1);
		Employee emp2 = new Employee(101,"Nani",addr2);
		
		emp1.display();
		emp2.display();
		
		
	}
	
	void display() {
		System.out.println(id+" "+name);
		System.out.println(address.city+" "+address.state+" "+address.pincode);
	}

}
