package com;

import java.util.*;

public class TestDriver {
	
	public static void main(String args[]) {
		
		Driver driver1 = new Driver(101,"Car","Achyuth",7749);
		Driver driver2 = new Driver(199,"Bus","Sriki",7860);
		Driver driver3 = new Driver(449,"Lorry","Dilli",5473);
		Driver driver4 = new Driver(123,"Car","Raju",9999);
		
		ArrayList<Driver> driverslist = new ArrayList<>();
		driverslist.add(driver1);
		driverslist.add(driver2);
		driverslist.add(driver3);
		driverslist.add(driver4);
		
		Travel travel = new Travel();
		
		boolean res = travel.isCarDriver(driver4);
		System.out.println(res);
		travel.retrivebyDriverId(driverslist, 101);
		int res1 = travel.retriveCountOfDriver(driverslist, "Car");
		System.out.println(res1);
		ArrayList<Driver> res2 = travel.retriveDriver(driverslist, "Car");
		for(Driver drv:res2) {
			System.out.println(drv.getDriverName());
		}
	
		String res3 = travel.retriveMaximumDistanceTravelledDriver(driverslist).getDriverName();
		System.out.println(res3);

	}
}
