package com.optionaljava8feature;

public class OptionalDemo {

	public static void main(String[] args) {
		Student student =new Student(101, "Kotesh", "kotesh@gmail.com", "Kotesh@123");
		String studetName=student.name();
		System.out.println(studetName);
		System.out.println(studetName.toUpperCase());
		student=null;
		student.m1();
	}
}
