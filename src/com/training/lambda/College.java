package com.training.lambda;

@FunctionalInterface
public interface College {

	int i =0;
	public static final String collegeName = "PSNA";
	String area ="dindigul";
	
	public String printName(String name);
	
//	public void printNames();
	
	default void printArea() {
		System.out.println("area is " +area);
	}
	
	static void printI() {
		System.out.println("area is " +area);
	}
	
	
	
}
