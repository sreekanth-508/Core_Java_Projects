package com.singtel.collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
	
	public static void main(String[] args) {
		//It will not allow the duplicate keys
		//Ii will follows insertion order
		//It will allow null keys once but null values will allow multiple times
		Map<Integer, String> map = new LinkedHashMap<>();
		map.put(1, "Sreekanth");
		map.put(3, "Raju");
		map.put(9, "Ajith");
		map.put(2, "Nani");
		map.put(8, "Durga");
		map.put(10, "Aswini");
		map.put(11, null);
		map.put(null, null);
		map.put(null, null);
		
		System.out.println(map);
	}

}
