package myjavaproj;

public class ConstPract {
	
	int id;
	String name;
	
	ConstPract(int x,String y){
		id = x;
		name = y;
	}

	public static void main(String[] args) {
		ConstPract c = new ConstPract(101,"Achyuth");
		System.out.println(c.id+" "+c.name);

	}

}
