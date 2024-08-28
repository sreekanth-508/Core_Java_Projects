package com.singtel.collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
	
	public static void main(String[] args) {
		//same as ArrayList but it uses a dynamic array for storing elements
		List<Integer> list = new LinkedList<>();
		LinkedList<Integer> list1 = new LinkedList<>();

		//Add elements to the list
        list.add(10);
        list.add(30);
        list.add(20);
        list.add(40);
        list.add(100);
        list.add(5);
        list.add(11);
        System.out.println("List: " + list); //Print the list values
        
        //Add elements to list1
        list1.add(200);
        list1.add(102);
        System.out.println("List1 before addFirst: " + list1); //Print list1 values before addFirst
        
        //Add elements to the beginning of list1 using addFirst
        list1.addFirst(500);
        list1.addFirst(300);
        System.out.println("List1 after addFirst: " + list1); //Print list1 values after addFirst
        
        //Add all elements from list1 to list
        list.addAll(list1);
        System.out.println("Combined List: " + list); //Print the combined list
        
        //Print size of the list
        System.out.println("Size of List: " + list.size());
		
	}

}
