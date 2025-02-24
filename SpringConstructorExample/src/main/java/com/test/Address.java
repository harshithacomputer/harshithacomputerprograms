package com.test;

public class Address {
	private String street;
	private String city;
	public Address(String street, String city) {
		super();
		this.street = street;
		this.city = city;
	}
	public void disp() {
		System.out.println("My Street is :" +street+ " And City is :"+city);
	}

}
