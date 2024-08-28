package com.singtel.oops;

public interface B {
	
	public void interfaceB();
	
	default void add(int a,int b) {
		int c = a+b;
		System.out.println(c);
	}

}
