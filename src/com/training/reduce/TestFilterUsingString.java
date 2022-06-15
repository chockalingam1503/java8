package com.training.reduce;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestFilterUsingString {

	public static void main(String[] args) {
		
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("Chennai");
		ar.add("Allahabad");
		ar.add("Coimbatore");
		
		List<String> newlist = ar.stream().filter(a->a.startsWith("C")).toList();
		
		System.out.println(newlist);
		
ar.stream().filter(a->a.startsWith("C")).map(a->a.concat(" : ")).forEach(a->System.out.println(a));
		
//		for (String string : newlist) {
//			
//		}
		
		
	}

}
