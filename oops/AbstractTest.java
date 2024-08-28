package com.singtel.oops;

public class AbstractTest extends AbstractDemo{
	
	@Override
	public void demo() {
		// TODO Auto-generated method stub
		System.out.println("Simple demo method...!");
	}
	
	public static void main(String[] args) {
		AbstractTest t = new AbstractTest();
		t.add();
		t.demo();
		hello();
	}
}
