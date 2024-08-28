package com.singtel.java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo {
	
	public static void main(String[] args) {
		List<Integer> arr =Arrays.asList(1,3,5,2,10,13,15);
		//arr.stream().filter(a -> a %2 == 0).forEach(System.out::println);
	List<Integer> result =arr.stream().filter(a -> a %2 == 0).collect(Collectors.toList());
	System.out.println(result);
	}

}
