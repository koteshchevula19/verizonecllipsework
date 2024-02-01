package com.javaproject;

public class HelperforEngineer {

	public static void main(String[] args) {
		Engineer endobj1=new Engineer(101, "kotesh", 3, "ECE", 4);
		Engineer endobj2=new Engineer(101, "kotesh", 3, "ECE", 4);
		if(endobj1.equals(endobj2))
		{
		System.out.println("Same Employee");	
			}
		else {
			System.out.println("Different Student");
		}
//		String s1="Hello";
//		String s2=new String("Hello");
//		System.out.println(s1.equals(s2));
		}
}
