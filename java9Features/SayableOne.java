package com.singtel.java9Features;

public interface SayableOne {
	
	default void say() {
		hai();//calling for private method only
		hello();//calling for private, static method
	}

	private void hello() {
		System.out.println("I'm private method...!");
	}

	private static void hai() {
		System.out.println("I'm private with static method...!");
	}

}
