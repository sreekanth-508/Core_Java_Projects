package com.singtel.java8Features;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StudentTest {

	public static void main(String[] args) {
		List<Student> list = Arrays.asList(new Student("Sreekanth", 26), 
				new Student("Ramlal", 24),
				new Student("Pushpa", 22));
		Collections.sort(list, new NameComparator());
		System.out.println(list);
	}

}
