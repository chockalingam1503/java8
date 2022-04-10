package com.training.filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;



public class TestFilter {

	public static void main(String[] args) {
		
		ArrayList<Student> ar = new ArrayList<Student>();
		 
        // Adding entries in above List
        // using add() method
        ar.add(new Student(111, "Mayank", "london"));
        ar.add(new Student(131, "Anshul", "nyc"));
        ar.add(new Student(121, "Solanki", "jaipur"));
        ar.add(new Student(101, "Aggarwal", "Hongkong"));
        ar.add(new Student(100, "Zelensky", "Hongkong"));
        
      //  ar.stream().filter(stud -> stud.rollno >=120).forEach(stud->System.out.println(stud));
		
       System.out.println( Evaluate.evaluateRollNo(ar));
       
       ar.stream().sorted( (o1,o2) -> o1.name.compareTo(o2.name) ).forEach(stud->System.out.println(stud));
       
       List<Integer> lst = Arrays.asList(9,1,2,7);
       
    		   lst.stream().sorted().forEach(stud->System.out.println(stud));
    		   
    		   System.out.println(lst);
    		   
    		
		
	}
	
}
