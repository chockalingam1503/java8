package com.training.methodreference;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Methodreference {

	
	public static void add(Student s) {
		System.out.println(s);
		
	}
	public static void main(String[] args) {
		
		
		 ArrayList<String> cars = new ArrayList<String>();
		    cars.add("Volvo");
		    cars.add("BMW");
		    cars.add("Ford");
		    cars.add("Mazda");
		    System.out.println(cars);
		    
		    
		    cars.forEach(System.out::println);
		    
		    
		    Student s1 = new Student(1, "CHock", "medavakkam");
		    Student s2 = new Student(2, "Seetha", "medavakkam");
		    
		    ArrayList<Student> students = new ArrayList<Student>();
		    students.add(s2);
		    students.add(s1);
		    
		//    List<Student> newList = students.stream().filter(s->s.getName().startsWith("C")).collect(Collectors.toList());
		 //   List<Student> newList = students.stream().filter(Student::getName.startsWith("C")).collect(Collectors.toList());
		    
		   students.stream().forEach(s->s.toString());
		   students.stream().forEach(Student::toString);
		   
		   
		  
	}
	
}
