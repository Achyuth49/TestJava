package com;

import java.util.ArrayList;

public class Travel {
	
	public boolean isCarDriver(Driver drv) {
		
		return drv.getCategory().equalsIgnoreCase("Car");
	}
	
	public String retrivebyDriverId(ArrayList<Driver> driverlist, int searchdriverid) {
		
		for(Driver dlist : driverlist) {
			if(dlist.getDriverId() == searchdriverid) {
				System.out.println("Driver name is "+dlist.getDriverName()+" Belonging to the category "
						+dlist.getCategory()+" traveled "+dlist.getTotalDistance()+" KM so far");
			}
		}
		return "";
		
	}
	
	public int retriveCountOfDriver(ArrayList<Driver> driverlist, String cate ) {
		
		int count=0;
		
		for(Driver dlist : driverlist) {
			if(dlist.getCategory().equalsIgnoreCase(cate)) {
				count++;
			}
		}
		return count;
	}
	
	public ArrayList<Driver> retriveDriver(ArrayList<Driver> driverlist, String categ) {
		
		ArrayList<Driver> result = new ArrayList<>();
		
		for(Driver dlist : driverlist) {
			if(dlist.getCategory().equalsIgnoreCase(categ)) {
				result.add(dlist);
			}
		}
		return result;
	}
	
	public Driver retriveMaximumDistanceTravelledDriver(ArrayList<Driver> driverslist) {
		
		Driver maxDist = driverslist.get(0);
		
		for(Driver dlist : driverslist) {
			if(dlist.getTotalDistance()>maxDist.getTotalDistance()) {
				maxDist = dlist;
			}
		}
		return maxDist;
	}
}
