package com.singtel.java9Features;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {

	// This example returns an empty list because it
	// fails at first list element, and takewhile stops here
	// Stream.of(1,2,4,5,6,7,8,9,10).
	public static void main(String[] args) {

		List<Integer> list = Stream.of(2, 4, 5, 6, 7, 8, 9, 10)
				.takeWhile(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(list);
	}

}
