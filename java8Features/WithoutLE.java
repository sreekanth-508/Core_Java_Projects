package com.singtel.java8Features;

interface Hello{
	public void say();
}
class HelloOne implements Hello{

	@Override
	public void say() {
		// TODO Auto-generated method stub
		System.out.println("Welcome to NCS...!");
	}
	
}
public class WithoutLE {
	
	public static void main(String[] args) {
		HelloOne ho = new HelloOne();//without using lambda expression
		ho.say();
		
	
		Hello h = new HelloOne();//using parent interface and child class
		h.say();
		
		//with using lambda expression
		Hello h1 = ()->System.out.println("Welcome to Pune...!");
		h1.say();
	}

}
