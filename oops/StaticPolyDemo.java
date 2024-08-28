package com.singtel.oops;

public class StaticPolyDemo {
	
	public void add(int a ,int b) {
		int c = a+b;
		System.out.println(c);
	}
	public void add(int a, float b) {
		float c = a+b;
		System.out.println(c);
	}
	public void add(float a,double b) {
		double c = a+b;
		System.out.println(c);
	}
	public void add(String a,char b) {
		String c = a+b;
		System.out.println(c);
	}
	public void add(int a,float b,double c) {
		double d = a+b+c;
		System.out.println(d);
	}
	public void add(char a,String b,String c,String d,float e) {
		String k = a+b+c+d+e;
		System.out.println(k);
	}
	public static void main(String[] args) {
		StaticPolyDemo s = new StaticPolyDemo();
		s.add(1, 20);
		s.add(10, 30.45f);
		s.add(20.67f, 34.04d);
		s.add("Sreekanth ", 'C');
		s.add(10, 20.34f, 30.25d);
		s.add('C', ", Sreekanth",", sreekanth@gmail.com" , ", Male", 20);	
	}
	
}
