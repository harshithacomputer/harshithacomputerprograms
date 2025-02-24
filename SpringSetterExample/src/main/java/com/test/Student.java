package com.test;

public class Student {
	private int id;
	private String studentName;
	public void setId(int id) {
		this.id = id;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public void disp() {
		System.out.println("Student Name is:"+studentName +"and ID is :"+id);
	}

}
