package com.verizonmaven.springjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.stereotype.Component;

@Component
public class PreparedStatementDemo {
	
	Connection dbConnection;
	
	PreparedStatement prepStatement;
	
	void connectToDb() {
		try {
//			Load the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
//			Connect to the database
			dbConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/verizon_chennai_jan24", "root", "");
				
		} catch (ClassNotFoundException e) {
			System.out.println("Driver not found : " + e.getMessage());
		} catch (SQLException e) {
			System.out.println("Can't connect to the database: " + e.getMessage());
		}
	}
	
//	Fetch All employees
	void getAllEmployees() {
		String qry = "select * from employee";
		
		try {
//			Get a reference to the PreparedStatement object
			prepStatement = dbConnection.prepareStatement(qry);
			
//			Execute the query
			ResultSet resultSet = prepStatement.executeQuery();
			
//			Traverse
			while(resultSet.next()) {
				System.out.println(resultSet.getString("emp-name"));
			}
		} catch (SQLException e) {
		System.out.println("Issues while reading : " + e.getMessage());	
		}
	}
	
	
	
//	Add an employee
	void addNewEmployee(Employee employee) {
//		Write the query to insert
		String qry = "insert into employee values(?, ?, ?)";
		
//		Get a reference to the PreparedStatement object
		try {
			prepStatement = dbConnection.prepareStatement(qry);
		
		
//		Set the values for placeholders
		prepStatement.setString(1, employee.name());
		prepStatement.setInt(2, employee.id());
		prepStatement.setString(3, employee.workLocation());
		
//		Execute the query
		if(prepStatement.executeUpdate() > 0)
			System.out.println("New employee registered successfully...");
		} catch (SQLException e) {
			System.out.println("Issues while inserting : " + e.getMessage());
		}
		
	}
	
	
	
	
	
	
}

