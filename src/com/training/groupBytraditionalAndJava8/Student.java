package com.training.groupBytraditionalAndJava8;

public class Student {

	int rollno;
	String name, address;
	String grade;

	public Student(int rollno, String name, String address , String grade) {

		this.rollno = rollno;
		this.name = name;
		this.address = address;
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", address=" + address + ", grade=" + grade + "]";
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
	
	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

}
