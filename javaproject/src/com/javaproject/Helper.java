package com.javaproject;

import java.util.Arrays;
import java.util.Scanner;

public class Helper {

	static Engineer engArray[]=new Engineer[3];
	public static void main(String[] args) {
		Engineer engObj1=new Engineer();
		
		
		Scanner sc = new Scanner(System.in);
		try {
			for(int i=0;i<=2;i++) {
			System.out.println("Enter the Id:");
			engObj1.setEngId(sc.nextInt());
			System.out.println("Enter the engName");
			engObj1.setEngName(sc.next());
			System.out.println("Enter the engYear");
			engObj1.setEngYear(sc.nextInt());
			System.out.println("Enter the engCourse");
			engObj1.setEngCourse(sc.next());
			System.out.println("Enter the engDuration");
			engObj1.setEngDuration(sc.nextInt());
			
//			Integer id=engObj1.getEngId();	
//			String name=engObj1.getEngName();
//			Integer year=engObj1.getEngYear();
//			String course=engObj1.getEngCourse();
//			Integer duration=engObj1.getEngDuration();
			
//			Engineer obj2=new Engineer(id, name, year, course, duration);
//			engArray[i]=obj2
			engArray[i]=engObj1;
			
			}
		}

		catch (Exception e) {
			System.out.println(e.getMessage());
		} 
		
		finally {
			sc.close();
		}
		
//	System.out.println(engObj1);
		
//		engObj2.addEngineerObjects(engObj1);
	System.out.println(Arrays.toString(engArray));

	}

}
