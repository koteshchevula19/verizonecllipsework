package com.javaproject;

import java.util.ArrayList;
import java.util.Scanner;

public class HelperforEmployee {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee emp=new Employee();
		
		String wantToRun;
		System.out.println("Please enter your choice that is add if it is if you are runnning for the first time");
		do {
			System.out.println("Enter your choice of operation");

			String choice = sc.next();

			switch (choice) {

			case "add":
				System.out.println("please enter the employee details");
				System.out.println("Enter Id name");
				emp.addEmployee(new Employee(sc.nextInt(),sc.next(),sc.next()));
				
				break;

			case "delete":
				System.out.println("Deleting the emp details by name");
				String name=sc.next();
				sc.nextLine();
				emp.delete(name);

				break;
				
			case "display":
						System.out.println("Displaying emp details");
						emp.display();
				break;
				
			case "search":
				System.out.println("Searching by the name");
				emp.search(sc.next());
				break;
			case "update":
				System.out.println("Updating by the name");
				emp.update(sc.next());
				
				break;
				
				default:
					System.out.println("Enter a valid choice");
			}
			System.out.println("Do you want to perform any operation if yes type yes if no type no[yes/no]");
			wantToRun = sc.next();

		} while (wantToRun.equalsIgnoreCase("yes"));

	}
	

}
