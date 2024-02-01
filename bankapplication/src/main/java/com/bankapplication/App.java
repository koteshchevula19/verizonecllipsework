package com.bankapplication;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
         
        Operations operations=context.getBean("operations",Operations.class);
        
        String signing;
        Scanner sc=new Scanner(System.in);
        String runOrStop;
        Integer chocieOfOperation;
        
        do {
        	
        	System.out.println("Please enter signup for adding and signin for signing in");
        	signing=sc.next();
        	if(signing.equalsIgnoreCase("signup")) {
        		System.out.println("Please neter name email password");
        		Integer id=sc.nextInt();
        		String name=sc.next();
        		String email=sc.next();
        		String password=sc.next();
        		
        		operations.registerUser(new UserDetails(id,name,email,password));
        	}
        	
        	if(signing.equalsIgnoreCase("signin")) {
        		
        		System.out.println("Please enter your choice");
        		chocieOfOperation=sc.nextInt();
        		switch(chocieOfOperation) {
        		
        		case 1: 
        			System.out.println("Deposting the money");
        			Float depositbalance=sc.nextFloat();
        			Integer id=sc.nextInt();
        			System.out.println("updated Balance: "+operations.depositing(depositbalance,id));
        			
        		}
        	}
        	System.out.println("Enter y to run and anyother key to stop");
        	runOrStop=sc.next();
        }while(runOrStop.equalsIgnoreCase("y"));
    }
}
