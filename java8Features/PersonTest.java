package com.singtel.java8Features;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PersonTest {

	public static void main(String[] args) {
		List<Person> list = Arrays.asList(new Person("Sreekanth", 26),
				new Person("Ramlal", 24),
				new Person("Nani", 22));
		Collections.sort(list);
		System.out.println(list);
	}
}
