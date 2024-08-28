package com.singtel.collections;

import java.util.Stack;

public class StackDemo {
	
	public static void main(String[] args) {
		//Stack will follow LIFO or FILO mechanism
		//Stack is the child of vector class
		Stack<String> s = new Stack<>();
		s.push("Sreekanth");
		s.push("Nani");
		s.push("Ramlal");
		s.push("Raju");
		s.push("Pushparaj");
		s.push("Ajith");
		s.push("Sathish");
		
		//to print the elements
		System.out.println(s);
		System.out.println(s.capacity());
		System.out.println(s.size());
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s);
		
	}

}
