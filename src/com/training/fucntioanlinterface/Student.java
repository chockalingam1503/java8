package com.training.fucntioanlinterface;

public class Student implements Bike {

	
	
	int studentId=10;
	public void printName() {
		System.out.println("college name is ");
		
	}
	@Override
	public String printBikeName(int bikeNum , String brand) {
	System.out.println(brand);
	return brand;
		
	}
	


	@Override
	public String toString() {
		return "Student [studentId=" + studentId + "]";
	}
	public static void main(String[] args) {
		Bike s = new Student();
		s.printBikeName(1234 , "Pulsar");
		
		System.out.println(s);
		
		
		
	}
	
}
