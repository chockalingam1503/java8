package com.training.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Evaluate {

	public static  List<Student> evaluateRollNo(ArrayList<Student> ar  ) {
		
		return    ar.stream().filter(stud -> stud.rollno >=120).collect(Collectors.toList());
		
	}
	
}
