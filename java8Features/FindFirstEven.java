package com.singtel.java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstEven {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,3,5,9,10,12);
	    Optional<Integer> findFirstEven = numbers.stream()
			                                 .filter(num->num%2==0).findFirst();
	  // findFirstEven.ifPresent(System.out::println);
	    System.out.println(findFirstEven.get());
	}

}
