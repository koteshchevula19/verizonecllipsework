package com.verizonmaven.springjdbc;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		JdbcTemplateDemo jdbctemplatedemo = context.getBean("jdbcTemplateDemo", JdbcTemplateDemo.class);
		Scanner sc=new Scanner(System.in);
//		System.out.println("Number ofEmployees: "+jdbctemplatedemo.getNumberOfRegisteredEmployees());
		System.out.println("Enter the Id");
//		System.out.println("Names of the employee : "+jdbctemplatedemo.getEmployeeNameById(sc.nextInt()));
//		System.out.println("EMployee Details:"+jdbctemplatedemo.getEmployeeDetailsById(sc.nextInt()));
//		jdbctemplatedemo.getAllEmployees().forEach(System.out::println);
//		 String empName = sc.next();
//       
//        Integer empId = sc.nextInt();
//        sc.nextLine();
//        
//        String empWorkLocation = sc.nextLine();
//        System.out.println(jdbctemplatedemo.updateEmployeeByUsingId(new Employee(empName, empId, empWorkLocation)));
//		System.out.println(jdbctemplatedemo.deleteById(sc.nextInt()));
//        jdbctemplatedemo.getAllEmployees().forEach(System.out::println);
        System.out.println("Name of the Employee:"+jdbctemplatedemo.getEmployeeDetailsByIdUsingDirectlyNameinThePlaceofPlaceHolders(sc.nextInt()));
        //        DbConnect dbConnect = context.getBean("dbConnect", DbConnect.class);
//        
//        dbConnect.connectToDb();
//        
////        dbConnect.getAllEmployees();
//        
//        Scanner scanner = new Scanner(System.in);
//        String choiceofOperation; 
//        String runorStop;
//        do {
//        	System.out.println("Enter your option add,display,update,delete");
//        	choiceofOperation=scanner.next();
//        	switch(choiceofOperation) {
//        	case "add":
//        		System.out.println("Enter name, id and work locactin of the new employee:");
//                
//            String empName = scanner.next();
//           
//            Integer empId = scanner.nextInt();
//            scanner.nextLine();
//            
//            String empWorkLocation = scanner.nextLine();
//            dbConnect.addNewEmployee(new Employee(empName, empId, empWorkLocation));
//            break;
//        	case "display":
//        		System.out.println("Displaying the table details");
//        		  dbConnect.getAllEmployees();
//        		  break;
//        	case "update":
//        		System.out.println("Enter name, id and work locactin of the new employee:");
//                
//                String name = scanner.next();
//                Integer id = scanner.nextInt();
//                scanner.nextLine();
//                String location = scanner.next();
//                dbConnect.updateEmployee(new Employee(name, id, location));
//                break;
//        	case "delete":
//        		 System.out.println("Deleting by ID");
//        	        
//        	        Integer deletebyId = scanner.nextInt();
//        	        dbConnect.deleteEmployee(deletebyId);
//        	        break;
//        		
//            
//        	}
//        	System.out.println("Enter Y  to run and N to stop");
//        	runorStop=scanner.next();
//        	
//        	
//        }
//        while(runorStop.equalsIgnoreCase("y"));
//        
//        
////        String empName = scanner.nextLine();
////        System.out.println("Deleting by ID");
////        
////        Integer empId = scanner.nextInt();
////        
////       
//        
//        
////        dbConnect.updateEmployee(new Employee(empName, empId, empWorkLocation));
////        dbConnect.addNewEmployee(new Employee(empName, empId, empWorkLocation));
//        
//       
//        
//        
//      
//
//        System.out.println("Exiting the application");
	}
}
