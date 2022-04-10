package com.training.fucntioanlinterface;

public class StudentAnonymousInnerImpl  {

	//this is traditonal inner calss
public static void main(String[] args) {
	
	Bike b = new Bike() {

		@Override
		public String printBikeName(int bikeNum, String brand) {
			// TODO Auto-generated method stub
		return "BikeNum = "+bikeNum + "\nBrand = "+brand;
		}
		
	};
	
	System.out.println(b.printBikeName(1234, "Discover"));
	
}



}
