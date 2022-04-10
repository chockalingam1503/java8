package com.training.optional;

import java.util.Optional;

public class TestOptional {

	public static void main(String[] args) {
		String[] words = new String[10];
		words[0]="tes";
		Optional<String> isNull = Optional.ofNullable(words[0]);
		if (isNull.isPresent()) {
        String word = words[0].toLowerCase();
        System.out.print(word);
		}
        		
        		
	 isNull = Optional.ofNullable(null);
		
		if(isNull.isPresent()) {
			System.out.println("Not Null") ;
			
		} else {
			System.out.println(" Null") ;
		}
		
	}
	
}
