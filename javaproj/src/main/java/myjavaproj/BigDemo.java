package myjavaproj;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigDemo {
	
	public static void main(String[] args) {
		
		BigInteger x = BigInteger.valueOf(49);//convert int/long into BI
		BigInteger a = new BigInteger("871235762171026577");//To read big values
		BigInteger b = new BigInteger("10358912359286597265");
		
		System.out.println(a.add(b));
		System.out.println(a.subtract(b));
		System.out.println(a.multiply(b));
		
		System.out.println("Problem with floating datatypes - float/double");
		double d1 = 0.04;
		double d2 = 0.06;
		
		System.out.println(d2-d1);// we should get 0.02 but the value is 0.019999999999999997
		
		BigDecimal b1 = new BigDecimal("0.06");
		BigDecimal b2 = new BigDecimal("0.04");
		
		System.out.println(b1.subtract(b2));//0.02

	}

}
