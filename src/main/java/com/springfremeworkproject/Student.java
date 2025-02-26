package com.springfremeworkproject;

public class Student {
	
	private Address address;

	public Student(Address address) {
		this.address = address;
		
	}
	
	public Student() {
		
	}
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void showInfo() {
		
		System.out.println("Address is: " +address);
	}
	
	
	/*
	private String studentName;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	//Define the init() and destroy() methods 
	
	public void initStudent() {
		
		System.out.println("This is the init() method...");
	}
	
	
	public void destroyStudent() {
		
		System.out.println("This is the destroy() method ...");
	}
	*/
	
//	public void sayHello() {
//		
//		System.out.println("Bom dia mundo de Spring Fremework");
//	}
		

}
