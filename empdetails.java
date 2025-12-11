package com.acharya.classes;

public class Employees {
	//instance variables
	int id;
	String name;
	double salary;
	//data or fields
	public Employees(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	//behaviour or functionality or methods
	//these below are our own methods or user defined methods
	public void getSalary() {
		System.out.println("The salary is : "+salary);
	}
	
	public void getName() {
		System.out.println("The name is : "+name);
	}
		
	public static void main(String args[]) {
		//object creation for employee class
		//here emp is reference or sometimes called object of employee class
		Employees emp = new Employees(12, "Acharya", 323245.00);
		System.out.println("Employee id is :"+emp.id);
		emp.getName();
		
		Employees emp1 = new Employees(14, "Kumar", 234232.00);
		System.out.println("Employee id is :"+emp1.id);
		emp1.getName();
		
		Employees emp2 = new Employees(24, "raj", 4232.00);
		System.out.println("Employee id is :"+emp2.id);
		emp2.getName();
		
	}

}
