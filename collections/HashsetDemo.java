package com.singtel.collections;

import java.util.HashSet;
import java.util.Set;

public class HashsetDemo {
	
	public static void main(String[] args) {
		//It will not follow the insertion order
		//It will not allow the duplicate values
		//It will null value once
		Set<String> set = new HashSet<>();
		set.add("Sreekanth");
		set.add("Nani");
		set.add("Ramlal");
		set.add("Sathish");
		set.add("Raju");
		set.add("Pushparaj");
		set.add("Sreekanth");
		set.add("Ajith");
		set.add("Sathish");
		set.add(null);
		set.add(null);
		
		//to print the list
		System.out.println("List : "+set);
		
		//to print the size of list
		System.out.println(set.size());
	}

}
