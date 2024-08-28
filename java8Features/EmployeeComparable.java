package com.singtel.java8Features;

public class EmployeeComparable implements Comparable<EmployeeComparable> {
	
	
	int id;
	String name;
	
	public EmployeeComparable(int id,String name) {
		this.id=id;
		this.name=name;
	}
	
	public String toString() {
		return "Id : "+id+", Name : "+name;
	}

	@Override
	public int compareTo(EmployeeComparable o) {
		// TODO Auto-generated method stub
		return o.id;
	}
	
	
}
