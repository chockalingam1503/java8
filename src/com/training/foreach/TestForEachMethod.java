package com.training.foreach;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestForEachMethod {

	public static void main(String[] args) {
		
		 ArrayList<String> cars = new ArrayList<String>();
		    cars.add("Volvo");
		    cars.add("BMW");
		    cars.add("Ford");
		    cars.add("Mazda");
		    System.out.println(cars);
		    
		    
		    cars.forEach(car->System.out.println(car));
		    
		    Collections.sort(cars , (car1,car2)->car1.compareTo(car2) );
		    
		    
		    cars.forEach(car->System.out.println(car));
		    
		    cars.stream().filter(car->car.startsWith("F")).forEach(car->System.out.println("Filtered car :" +car));
		    List<String> collect = cars.stream().collect(Collectors.toList());
		    
		    System.out.println("Method Ref");
		    collect.forEach(System.out::println);
		    
		    Map<Integer, String> map=new HashMap <Integer, String>();   
		    //Adding elements to map  
		    map.put(1,"Amit");  
		    map.put(5,"Rahul");  
		    map.put(2,"Jai");  
		    map.put(6,"Amit"); 
		    
		    map.forEach((id, name)-> System.out.println("id :"+id+ " Name : "+name));
		    map.entrySet().stream().filter(k->k.getValue().startsWith("A")).forEach(k->System.out.println("Filtered map :" +k));
		    
		    
		  
		    
		
		
	}
	
}
