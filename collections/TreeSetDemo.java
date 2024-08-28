package com.singtel.collections;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	
	public static void main(String[] args) {
		//It will follows the natural order
		//It will not allow the duplicate values
		//It will not allow null value
		Set<String> set = new TreeSet<>();
		set.add("Sreekanth");
		set.add("Nani");
		set.add("Ramlal");
		set.add("Sathish");
		set.add("Raju");
		set.add("Pushparaj");
		set.add("Sreekanth");
		set.add("Ajith");
		set.add("Sathish");
		//set.add(null);
		//set.add(null);
		
		//to print the list
		System.out.println("List : "+set);
		
		//to print the size of list
		System.out.println(set.size());
	}

}
