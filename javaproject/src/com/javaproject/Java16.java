package com.javaproject;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Java16 {
	ArrayList<Student> sobj = new ArrayList<Student>();
	Scanner sc = new Scanner(System.in);

	public void addStudent(Student s) {
		sobj.add(s);
		System.out.println(sobj);
		System.out.println(sobj.add(new Student("Mustaq","React",101)));
	}

	public void update(String name) {
		int index = 0;
		Integer id = 0;
		String updatedName = "", updatedDesg = "";
		System.out.println("Updating details..");

		for (Student s : sobj) {
			if (s.getName().equalsIgnoreCase(name)) {
				index = sobj.indexOf(s);
				System.out.println("Updating id.");
				System.out.println("Enter the id,namem");
				updatedName = sc.next();
				updatedDesg = sc.next();
				id = sc.nextInt();
				break;

			}
		}

		sobj.set(index, new Student(updatedName, updatedDesg, id));

	}
	
	public void display() {
		System.out.println(sobj);
	}
	
	public void sorting() {
		
		Collections.sort(sobj, new Comparator<Student>() {
			@Override
			public int compare(Student student1,Student student2) {
				return student1.getName().compareTo(student2.getName());			
				}
		});
//	Collections.sort(sobj,(s1, s2) -> s1.getName().compareTo(s2.getName()));
		
		System.out.println(sobj.stream());
	}
	

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		Java16 java = new Java16();
		System.out.println("Enter the Details:");
		String choice;
		String run;

		do {

			System.out.println("Please enter your choice");
			choice = sc.next();
			switch (choice) {

			case "add":
				System.out.println("adding student name desg id");
				java.addStudent(new Student(sc.next(), sc.next(), sc.nextInt()));
				break;
			case "update":
				System.out.println("Updating.. by name");
				java.update(sc.next());
				break;
			case "display":
				System.out.println("Displaying.....");
				java.display();
				break;
			case "sort":
				System.out.println("Sorting......");
				java.sorting();
					
			}
			System.out.println("Enter Yes or No");
			run = sc.next();

		} while (run.equalsIgnoreCase("yes"));

		System.out.println("Execution cmpltd");
	}

}

//record Student(String name, String desg, Integer id) {
//
//}

class Student{
	private String name;
	private String desg;
	private Integer id;
	
	public Student(String name, String desg, Integer id) {
		super();
		this.name = name;
		this.desg = desg;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", desg=" + desg + ", id=" + id + "]";
	}
	
	
}