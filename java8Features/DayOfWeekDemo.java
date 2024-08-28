package com.singtel.java8Features;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DayOfWeekDemo {

	public static void main(String[] args) {
		
		String input = "17-06-1998";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate localDate = LocalDate.parse(input, formatter);
		DayOfWeek dayOfWeek = localDate.getDayOfWeek();
		System.out.println(dayOfWeek);
	}
}
