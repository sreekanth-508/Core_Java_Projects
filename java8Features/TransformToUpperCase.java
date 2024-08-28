package com.singtel.java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TransformToUpperCase {
	
	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple","banana","orange","pineapple");
		List<String> upperCaseWords = words.stream()
				.map(String::toUpperCase)
				.collect(Collectors.toList());
	     upperCaseWords.forEach(System.out::println);
	}

}
