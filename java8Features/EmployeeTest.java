package com.singtel.java8Features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeTest {
	
	public static void main(String[] args) {
		
		List<Employee> emp = new ArrayList<>();
		emp.add(new Employee(6, "Sreekanth", 26, 30000));
		emp.add(new Employee(1, "Ramlal", 24, 50000));
		emp.add(new Employee(5, "Nani", 16, 100000));
		emp.add(new Employee(2, "Pushparaj", 28, 85000));
		emp.add(new Employee(8, "Ajith", 24, 20000));
		emp.add(new Employee(4, "Durga", 20, 18000));
		
		System.out.println("======Sort by Roll Number=====");
		Collections.sort(emp, new SortByRollNumber());
		System.out.println(emp);
		
		System.out.println("======Sort by Name=====");
		Collections.sort(emp, new SortByName());
		System.out.println(emp);
		
		System.out.println("======Sort by Age=====");
		Collections.sort(emp, new SortByAge());
		System.out.println(emp);
		
		System.out.println("======Sort by Salary=====");
		Collections.sort(emp, new SortBySalary());
		System.out.println(emp);
	}

}
