package com.singtel.oops;

public class SingleInheritanceTwo extends SingleInheritanceOne{
	
	public void mul(int a,int b) {
		int c = a*b;
		System.out.println("Multiplication of two numbers : "+c);
	}
	
	public static void main(String[] args) {
		SingleInheritanceTwo st = new SingleInheritanceTwo();
		st.add(10, 20);
		st.sub(20, 10);
		st.mul(20, 20);
	}

}
