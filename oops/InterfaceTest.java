package com.singtel.oops;

public class InterfaceTest implements A,B{

	@Override
	public void interfaceB() {
		// TODO Auto-generated method stub
		System.out.println("interfaceB() method");
	}

	@Override
	public void interfaceA() {
		// TODO Auto-generated method stub
		System.out.println("interfaceA() method");
	}
	public static void main(String[] args) {
		InterfaceTest i = new InterfaceTest();
		i.interfaceA();
		i.interfaceB();
		
		A.sum(10, 10);//A interface have static method
		i.add(20, 30);//B interface have default method
		
		
	}

}
