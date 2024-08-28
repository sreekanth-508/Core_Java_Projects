package com.singtel.iq;

public class CheckEvenOrOdd {
	
	public static void main(String[] args) {
		int num = 10;
		if(num %2 ==0) {
			System.out.println(num+" is even number");
		}else {
			System.out.println(num+" is odd number");
		}
		
		int odd = 3;
		if((odd&1)==0) {
			System.out.println(odd+" is even");
		}else {
			System.out.println(odd+" is odd");
		}
	}

}
