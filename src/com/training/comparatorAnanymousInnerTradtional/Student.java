package com.training.comparatorAnanymousInnerTradtional;

public class Student {

	// Attributes of a student
	int rollno;
	String name, address;

	// Constructor
	public Student(int rollno, String name, String address) {

		// This keyword refers to current instance itself
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}

	// Method of Student class
	// To print student details in main()
	public String toString() {

		// Returning attributes of Student
		return this.rollno + " " + this.name + " " + this.address;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
