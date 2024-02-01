package com.javaproject;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.concurrent.ConcurrentSkipListSet;

public class Employee {

	private  Integer empId;
	private String empName;
	private String empDesg;
	Scanner sc = new Scanner(System.in);

	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empDesg=" + empDesg + "]";
	}

	Employee() {

	}

	public Employee(Integer empId, String empName, String empDesg) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDesg = empDesg;
	}

	ArrayList<Employee> arrayList = new ArrayList<Employee>();
//	ConcurrentSkipListSet<Employee> arrayList=new ConcurrentSkipListSet<Employee>();

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpDesg() {
		return empDesg;
	}

	public void setEmpDesg(String empDesg) {
		this.empDesg = empDesg;
	}

	public void addEmployee(Employee empobj) {
		arrayList.add(empobj);
	}

	public void display() {
		for (Employee employee : arrayList) {
			System.out.println(employee);
		}
	}

	public void delete(String delbyName) {
//		LinkedHashSet lhs=new LinkedHashSet(arrayList);
	int	index=0;
		try {
		for (Employee employee : arrayList) {
			
			if (employee.empName.equalsIgnoreCase(delbyName)) {
				System.out.println("Succesfully removed");
				
				index=arrayList.indexOf(employee);
					arrayList.remove(employee);
//				lhs.remove(employee);
//				System.out.println("LHS :"+lhs);
//					break;
				} 
			}
		}
			catch (ConcurrentModificationException e) {
//					System.out.println(e.getMessage());
				}
//		arrayList.remove(index);
			} 
		
		
	

	public void search(String searchbyName) {
		for (Employee employee : arrayList) {

			if (employee.empName.equalsIgnoreCase(searchbyName)) {
				System.out.println(employee);
			}
		}

	}

	public void update(String updatebyName)  {
		String choiceofUpdate = "";
		for (Employee employee : arrayList) {
			
			
			try {
				if (employee.empName.equalsIgnoreCase(updatebyName)) {

					System.out.println("What you want me to update ");
					choiceofUpdate = sc.next();
				
				if (choiceofUpdate.equalsIgnoreCase("empId")) {
					System.out.println("enter the Id");
					employee.empId = sc.nextInt();
				}
//				if (choiceofUpdate.equalsIgnoreCase("empDesg")) {
//					System.out.println("Enter the new Designation");
//
//					employee.empDesg = sc.next();
//				}
//				if (choiceofUpdate.equalsIgnoreCase("empName")) {
//					System.out.println("Enter the newName");
//					employee.empName = sc.next();
//				}
				}
			}
					
				catch(Exception e) {
					System.out.println(e.getMessage());
				}
			

			
			System.out.println("Updated employee details" + employee);
			
		}

	}

}
