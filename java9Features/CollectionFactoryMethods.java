package com.singtel.java9Features;

import java.util.List;
import java.util.Map;

public class CollectionFactoryMethods {
	
	public static void main(String[] args) {
		
		List<Integer> list = List.of(1,2,3,4,5,6,7,8,9);
		for(int i : list) {
			System.out.print(" "+i);
		}
		
		Map<Integer,String> map = Map.of(101,"JavaFX",102,"Hibernate",103,"Spring MVC");  
        for(Map.Entry<Integer, String> m : map.entrySet()){  
            System.out.println(m.getKey()+" "+m.getValue());  
     
        }
        
        System.out.println("=====================================");
        // Creating Map Entry  
        Map.Entry<Integer, String> e1 = Map.entry(101, "Java");  
        Map.Entry<Integer, String> e2 = Map.entry(102, "Spring");  
        // Creating Map using map entries  
        Map<Integer, String> map1 = Map.ofEntries(e1,e2);  
        // Iterating Map   
        for(Map.Entry<Integer, String> m : map1.entrySet()){    
            System.out.println(m.getKey()+" "+m.getValue());  
        }  
	}

}
