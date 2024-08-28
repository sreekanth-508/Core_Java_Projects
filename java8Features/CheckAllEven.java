package com.singtel.java8Features;

import java.util.Arrays;
import java.util.List;

public class CheckAllEven {
	
	public static void main(String[] args) {
		
		List<Integer> even = Arrays.asList(2,4,6,8,10);
		boolean allEven = even.stream().allMatch(num ->num%2==0);
		System.out.println("Check all even numbers or not : "+allEven);
	}

}
