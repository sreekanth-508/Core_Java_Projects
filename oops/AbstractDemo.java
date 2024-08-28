package com.singtel.oops;

public abstract class AbstractDemo {
	
	//Abstract class have abstract methods as well as concrete methods (Instance & Static methods)
	
	public abstract void demo();
	public void add() {
		System.out.println("Instance method in abstract class");
	}
	public static void hello() {
		System.out.println("Static method in abstract class");
	}

}
