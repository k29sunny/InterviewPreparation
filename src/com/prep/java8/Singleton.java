package com.prep.java8;

//Singleton Design pattern  
public class Singleton {
	
	private static Singleton instance;
	
	private Singleton() {
		
	}
	
	public static Singleton getinstance() {
		
		if(instance == null) {
			instance= new Singleton();
		}
		
		return instance;
		
	}

}
