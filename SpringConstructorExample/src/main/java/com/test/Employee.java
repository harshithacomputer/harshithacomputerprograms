package com.test;

public class Employee {
private int id;
private String employeeName;
private Address address;
public Employee(int id, String employeeName, Address address) {
	
	this.id = id;
	this.employeeName = employeeName;
	this.address = address;
}
public void hello() {
	System.out.println("My ID is :" +id+ " And Name is :"+employeeName);
	address.disp();
}
}
