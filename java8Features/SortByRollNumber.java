package com.singtel.java8Features;

import java.util.Comparator;

class SortBySalary implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		//return (int) (o1.salary-o2.salary);
		return Float.compare(o1.salary, o2.salary);
	}
	
}
class SortByAge implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		//return o1.age-o2.age;
		return Integer.compare(o1.age, o2.age);
	}
	
}
class SortByName implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		//return o1.name.compareTo(o2.name);
		return o1.name.compareTo(o2.name);
	}
	
}
public class SortByRollNumber implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		//return o1.rollNumber-o2.rollNumber;
		return Integer.compare(o1.rollNumber, o2.rollNumber);
	}
	

}
