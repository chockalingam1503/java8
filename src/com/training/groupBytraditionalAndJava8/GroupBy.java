package com.training.groupBytraditionalAndJava8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class GroupBy {
	
	public static void main(String[] args) {
		
		  List<Student> ar = new ArrayList<>();  
		 ar.add(new Student(111, "Mayank", "london" , "Four"));
	        ar.add(new Student(131, "Anshul", "nyc",  "Four"));
	        ar.add(new Student(121, "Solanki", "jaipur" ,  "Three"));
	        ar.add(new Student(101, "Aggarwal", "Hongkong",   "Three"));
	        ar.add(new Student(100, "Zelensky", "Hongkong",   "Five"));
		Map<String,List<Student>> studebtByGrade= new HashMap<>();  
		
		for (Student student : ar) {
			
			if(!studebtByGrade.containsKey(student.getGrade())){
				List<Student> stdList = new ArrayList<>();
				studebtByGrade.put(student.getGrade(), stdList);
			} 
			
			studebtByGrade.get(student.getGrade()).add(student);
			
			
		}
		
		System.out.println(studebtByGrade);
		
		//with java8
		studebtByGrade=ar.stream().collect(Collectors.groupingBy(student->student.getName()));
		System.out.println(studebtByGrade);
		studebtByGrade=ar.stream().collect(Collectors.groupingBy(Student::getAddress));
		System.out.println(studebtByGrade);
		
		
	}

}
