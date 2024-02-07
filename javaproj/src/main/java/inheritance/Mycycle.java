package inheritance;

class Mycycle extends Bicycle{
	
	int seatHeight;
	
	Mycycle(int gear,int speed,int setHeight){
		super(gear,speed);
		seatHeight = setHeight;
	}
	
	public String toString() {
		return(super.toString()+"\n seat height is :"+seatHeight);
	}
	
	public static void main(String[] args) {
		Mycycle mc = new Mycycle(4,90,5);
		System.out.println(mc.toString());
	}

}
