package com.singtel.collections;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
	
	public static void main(String[] args) {
		//It will not allow the duplicate keys
		//Ii will follows sort key based on natural order
		//It will not allow null keys
		Map<Integer, String> map = new TreeMap<>();
		map.put(1, "Sreekanth");
		map.put(3, "Raju");
		map.put(9, "Ajith");
		map.put(2, "Nani");
		map.put(8, "Durga");
		map.put(10, "Aswini");
		map.put(11, null);
		//map.put(null, null);
		
		
		System.out.println(map);
	}

}
