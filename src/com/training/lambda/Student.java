package com.training.lambda;

public class Student {

	public static void main(String[] args) {
		
//	College c=	(String name)->{
//			System.out.println("College name is " +name);
//		};
		
		//can be optimized as 
		
//		College c=	(String name)->	System.out.println("College name is " +name);
//	};
		
		//can be optimized as in single line with return type , datatype of name is not required as there is only single abstarct method 
		
		College c1=	(name)-> "College name is " +name ;
		//with return type  and multiple lines
		
		College c=	(name)-> {
		String nammExtra="newName";
		return "College name is " +name +""+nammExtra;
		};
		
	System.out.println(c.printName("PSNA"));
	System.out.println(c1.printName("PSNA"));	
		
	}

}
