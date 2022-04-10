package com.training.comparatorTradtional;

import java.util.Comparator;

public class SortByName implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
	//	return o1.name.compareTo(o2.name); this line print in normal alphabetical order below line prints in reverse alphabetcial order
		return o2.name.compareTo(o1.name);
	}

}
