package com.java8;

import java.util.Arrays;
import java.util.List;

public class PredicateDemo {
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee("Achyuth",49000);
		Employee e2 = new Employee("Nani",12000);
		Employee e3 = new Employee("Ram",25000);
		
		List<Employee> empList = Arrays.asList(e1,e2,e3);
		
		empList.stream().filter(e -> e.salary>15000).forEach(e -> {
			System.out.println(e.name);
		});
		
		
	}

}

class Employee{
	String name;
	int salary;
	
	Employee(String name,int salary){
		this.name = name;
		this.salary = salary;
	}
	
	void display() {
		System.out.println("Employee name :"+name+" and his salary is:"+salary);
	}
}
