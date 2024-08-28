package com.singtel.java8Features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeComparableTest {
	
	public static void main(String[] args) {
		List<EmployeeComparable> e = new ArrayList<>();
		e.add(new EmployeeComparable(1, "Sreekanth"));
		e.add(new EmployeeComparable(0, "Ajith"));
		e.add(new EmployeeComparable(6, "Nani"));
		e.add(new EmployeeComparable(4, "Ramlal"));
		
		Collections.sort(e);
		System.out.println("Sort by Id : "+e);
		
		Comparator<EmployeeComparable> e1 = new Comparator<EmployeeComparable>() {
			
			@Override
			public int compare(EmployeeComparable o1, EmployeeComparable o2) {
				// TODO Auto-generated method stub
				return o1.name.compareTo(o2.name);
			}
		};
		
		Collections.sort(e,e1);
		System.out.println(e);
	}

}
