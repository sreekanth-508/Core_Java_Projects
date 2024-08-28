package com.singtel.java9Features;

import java.util.stream.Stream;

public class NullableDemo {

	public static void main(String[] args) {  
        Stream<Integer> val   
        = Stream.ofNullable(null);     
    val.forEach(System.out::println);  
    
    }  
}  