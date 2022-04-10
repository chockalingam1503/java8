package com.training.comparatorTradtional;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudenCompare {

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
       
        Collections.sort(ar, new SortByName());
        
        System.out.println("\nSorted by name");
        
        // Again iterating over entries to print them
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));
        
    Collections.sort(ar, new SortByRollNo());
        
        System.out.println("\nSorted by RollNo");
        
        // Again iterating over entries to print them
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));
       
        
    	
    	String name1="Zia";
    	String name2="Amrish";
    	
    	System.out.println(name2.compareTo(name1));
	}

	

}

