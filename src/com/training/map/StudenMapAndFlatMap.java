package com.training.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StudenMapAndFlatMap {

	public static void main(String[] args) {

		List<Student> ar = new ArrayList<Student>();
		 
        // Adding entries in above List
        // using add() method
        ar.add(new Student(111, "Mayank", "london"));
        ar.add(new Student(131, "Anshul", "nyc"));
        ar.add(new Student(121, "Solanki", "jaipur"));
        ar.add(new Student(101, "Aggarwal", "Hongkong"));
        ar.add(new Student(100, "Zelensky", "Hongkong"));
        
        ar.get(0).setPhoneNos("1235556");
        ar.get(0).setPhoneNos("1235526");
        ar.get(0).setPhoneNos("1235522");
        ar.get(1).setPhoneNos("1235555");
        ar.get(1).setPhoneNos("1235521");
        ar.get(2).setPhoneNos("123552299");
      
        
        //in traditional we need to inretae the list and then read name and then store in arrayList, java8 simiplifies that using map
        
        List<String> nameList = ar.stream().map(student->student.getName()).collect(Collectors.toList());
        
        System.out.println(nameList);
        
        List<String> phoneNoFlatList = ar.stream().flatMap(student->student.getPhoneNos().stream()).collect(Collectors.toList());
        
        System.out.println(phoneNoFlatList);
        
	}

	

}

