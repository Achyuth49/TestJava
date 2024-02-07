package inheritance;

	class Bicycle {
	
	int gear;
	int speed;
	
	 Bicycle(int gear,int speed){
		this.gear = gear;
		this.speed = speed;
	}
	
	 @Override
	public String toString() {
		// TODO Auto-generated method stub
		return ("No.of gears :"+gear+"\n"+"speed of bicycle is:"+speed);
	}
}
	
