package com.training.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class TestMap {

	public static void main(String[] args) {

		
		
		String [] cityArray1 ={"chennai", "COimbatore" , "Bangalore" };
		List<String> cityList1 = new ArrayList<String>(Arrays.asList(cityArray1 ));
		
//		cityList1.stream().map(city->city=city+" :")
		
		int index =0;
		for (String city : cityList1) {
			
			cityList1.set(index++, city.concat( " :").toUpperCase());
			
		}
		
		System.out.println(cityList1);
		
		
		
		HashSet<String> cityList2 = new HashSet<String>(cityList1);
		cityList2.add("Theni");
		
		System.out.println(cityList2);
		
		cityList2.stream().sorted().forEach(System.out::print);
		
		
		List<String> cityList3 = cityList2.stream().map(city->city.toUpperCase()+"-").collect(Collectors.toList());
		System.out.println("third list from map : " +cityList3);
	}
	
	
	
	

}
