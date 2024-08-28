package com.singtel.java9Features;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class TryWithResource {
	
	public static void main(String[] args) throws FileNotFoundException {
		try(FileOutputStream fo = new FileOutputStream("sreekanth.txt");){
		
		String greeting = "Welcome to Bangalore";
		byte b[]=greeting.getBytes();
	    fo.write(b);
	    System.out.println("File written");
	}catch(Exception e) {
		System.out.println(e);
	}
	}

}
