package com.singtel.java9Features;

public class AnynomousInnerTest {
	
	public static void main(String[] args) {
		AnynomousInnerClass<String> ex = new AnynomousInnerClass<>() {
			
			@Override
			String show(String a, String b) {
				// TODO Auto-generated method stub
				return a+b;
			}
		}; 
		String result = ex.show("Java Version ", "9");
		System.out.println(result);
	}

}
