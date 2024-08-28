package com.singtel.java8Features;

public class Employee {
	
	 int rollNumber;
	 String name;
	 int age;
	 float salary;
	public Employee(int rollNumber, String name, int age, float salary) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	public String toString() {
		return "Roll Number : "+rollNumber+", Name : "+name+", Age : "+age+", Salary : "+salary;
	}

}
