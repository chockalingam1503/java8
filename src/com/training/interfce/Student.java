package com.training.interfce;

public class Student implements College{

	int studentId=10;
	@Override
	public void printName() {
		System.out.println("college name is "+ collegeName);
	}
	
	public void standAlone() {
		System.out.println("iam standlaone");
	}
	
	
	@Override
	public void printArea() {
		// TODO Auto-generated method stub
		College.super.printArea();
	}

	public static void main(String[] args) {
		College c= new Student();
		c.printArea();
		c.printName();
	System.out.println(c.i);
	
	Student s= new Student();
	System.out.println(s.studentId);
	s.standAlone();
	s.printName(); 
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
	
}



