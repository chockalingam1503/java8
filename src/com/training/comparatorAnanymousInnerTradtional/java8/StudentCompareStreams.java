package com.training.comparatorAnanymousInnerTradtional.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentCompareStreams {

public static void main(String[] args) {
	List<Student> ar = new ArrayList<Student>();
	 
    // Adding entries in above List
    // using add() method
    ar.add(new Student(111, "Mayank", "london"));
    ar.add(new Student(131, "Anshul", "nyc"));
    ar.add(new Student(121, "Solanki", "jaipur"));
    ar.add(new Student(101, "Aggarwal", "Hongkong"));
    ar.add(new Student(100, "Zelensky", "Hongkong"));
    
    // Display message on console for better readability
    System.out.println("Unsorted");

    // Iterating over entries to print them
    for (int i = 0; i < ar.size(); i++)
        System.out.println(ar.get(i));
    
    
    
    List<Student> sortedList = ar.stream().sorted( ( o1,  o2)-> o2.rollno-o1.rollno).collect(Collectors.toList());
    System.out.println(sortedList);
    
    List<Student> sortedList1 = ar.stream().sorted( ( o1,  o2)-> o1.name.compareTo(o2.name) ).collect(Collectors.toList());
    System.out.println(sortedList1);
    
}
	
	
	
}
