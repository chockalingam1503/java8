package com.training.comparatorTradtional;

import java.util.Comparator;

public class SortByRollNo implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		//return o1.rollno -o2.rollno; //asecnding 
		return o2.rollno -o1.rollno; //decsing
	}

}
