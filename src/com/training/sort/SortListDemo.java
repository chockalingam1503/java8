package com.training.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortListDemo {

public static void main(String[] args) {
	ArrayList<Integer> numList = new ArrayList<Integer>();
	numList.add(133);  
	numList.add(22);
	numList.add(44);
	numList.add(67);
	
	//java traditonal
	Collections.sort(numList);
	System.out.println(numList);
	
	Collections.reverse(numList);
	System.out.println("reverse order : " +numList);

	//with streams
		List<Integer> newList = numList.stream().sorted().collect(Collectors.toList());
		System.out.println(" order from streams : " +numList);
		System.out.println(newList);
		
		numList.stream().sorted().forEach(s->System.out.println(s));
}
	
}
