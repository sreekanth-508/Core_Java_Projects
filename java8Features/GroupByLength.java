package com.singtel.java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByLength {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "fig", "grape");

		Map<Integer, List<String>> groupedByLength = words.stream()
				                        .collect(Collectors.groupingBy(String::length));

		groupedByLength.forEach((length, wordList) -> {
			System.out.println("Length " + length + ": " + wordList);
		});
	}

}
