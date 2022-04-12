package com.training.functions;

import java.util.function.Function;

public class Functions {

	   
	public static void main(String[] args) {
		
	
	   Function<String, String> func= new Function<String, String>() {

		@Override
		public String apply(String t) {
			return t+" i am apply";
		}
	
		   
		   
	};
	
	System.out.println(func.apply("test "));
	
	}
}
