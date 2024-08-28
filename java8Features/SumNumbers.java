package com.singtel.java8Features;

import java.util.Arrays;
import java.util.List;

public class SumNumbers {
	
	public static void main(String[] args) {
		List<Integer> num =Arrays.asList(1,2,3,4,5);
		
		int sum = num.stream().mapToInt(Integer::intValue).sum();
		System.out.println("Sum of numbers : "+sum);
	}

}
