package com.singtel.java8Features;

interface HelloTwo{
	public void say();
}
public class WithLE {
	public static void main(String[] args) {
		
		//with using lambda expression
		HelloTwo h = ()->System.out.println("Welcome to Pune...!");
		h.say();
	}

}
