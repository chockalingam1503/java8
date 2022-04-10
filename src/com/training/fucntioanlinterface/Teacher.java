package com.training.fucntioanlinterface;

public class Teacher {

//	static Bike bike=(no , brand ) ->{
//	return "bike name is "+Bike.bikeName +" and bike nos is "+no + " bike brand "+brand;
//	};
	
	static Bike bike=(no , brand ) -> "bike name is "+Bike.bikeName +" and bike nos is "+no + " bike brand "+brand;
	
	
	//or
	//below is without any argument, above is with arugumens
	//static Bike bike1=() -> System.out.println("bike name is "+Bike.bikeName);

	public static void main(String[] args) {
		String printBikeName = bike.printBikeName(5067 , "Balaj");
		System.out.println(printBikeName);
	}
	
}
