package com.singtel.java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindMaxValue {
	
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7);
	  Optional<Integer> maxValue = numbers.stream()
			                              .max(Integer::compareTo);
	  maxValue.ifPresent(System.out::println);
	}

}
