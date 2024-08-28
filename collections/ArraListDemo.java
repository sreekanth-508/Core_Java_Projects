package com.singtel.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArraListDemo {
	
	public static void main(String[] args) {
		//ArrayList -> It will follows insertion order,
		//It will allow the duplicate values
		//It uses a dynamic array to store the duplicate elements
		//It is non-Synchronized
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(30);
		list.add(20);
		list.add(40);
		list.add(100);
		list.add(5);
		list.add(1);
		
		System.out.println(list);
		System.out.println("=========Using toString() :===========");
		System.out.print(list.toString());
		System.out.println(list.size());//it returns size of the list
		System.out.println(list.contains(100));//it returns boolean value
		System.out.println(list.indexOf(20));//it returns value of index numbers
		System.out.println(list.remove(6));//it will remove the index(6th(1)) number
		//System.out.println(list.removeAll(list));//it will remove the entire list values
		System.out.println(list.get(3));//it returns 3rd index value
		
		
		//to print the list of values 2nd way
		System.out.println("=====Using iterator()=====");
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
		  Integer num = it.next();
		  System.out.println(" "+num);
		}
		System.out.println("==========Check collection isEmpty()===============");
		System.out.println(" "+list.isEmpty());//It checks if collection is empty
		System.out.println("=========Using forEach loop============");
		//to print the list of values 1st way
		for(int i:list) {
			System.out.print(" "+i);
		} 
		
	}

}
