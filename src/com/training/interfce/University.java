package com.training.interfce;

public interface University {
	int i =0;
	public static final String collegeName = "PSNA";
	String area ="dindigul";
	
	public void printName();
	
	default void printArea() {
		System.out.println("area is " +area);
	}
	
	static void printI() {
		System.out.println("area is " +area);
	}
	public void show();
}
