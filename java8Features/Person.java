package com.singtel.java8Features;

public class Person implements Comparable<Person> {

	String name;
	int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Name : "+name+" age : "+age;
	}

	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return Integer.compare(this.age, o.age);
	}

}
