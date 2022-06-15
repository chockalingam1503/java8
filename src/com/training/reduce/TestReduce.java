package com.training.reduce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;



public class TestReduce {

	public static void main(String[] args) {
		
		List<Integer> lst = new ArrayList<Integer>();
		lst.add(2);
		lst.add(22);
		lst.add(3);
		lst.add(21);
		
    		
		 Optional<Integer> sum = lst.stream().reduce( (subtotal, element) -> subtotal + element);
		 
		 System.out.println(sum.get());
	}
	
}
