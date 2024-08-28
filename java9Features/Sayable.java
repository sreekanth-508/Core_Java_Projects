package com.singtel.java9Features;

public interface Sayable {

	default void hello() {
		saySometing();
	}

	private void saySometing() {
		System.out.println("Hai hello welcome to bangalore...!");
	}
}
