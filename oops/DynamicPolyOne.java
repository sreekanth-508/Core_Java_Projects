package com.singtel.oops;

public class DynamicPolyOne extends DynamicPoly{
	
	public void sree(char c,String s) {
		super.sree('R', " Ramlal");
		String d = c+s;
		System.out.println("Child class : "+d);
	}
	public static void main(String[] args) {
		DynamicPolyOne d = new DynamicPolyOne();
		d.sree('C', " Sreekanth");
	}

}
