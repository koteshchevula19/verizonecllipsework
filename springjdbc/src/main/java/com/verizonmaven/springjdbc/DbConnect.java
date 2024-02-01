package com.verizonmaven.springjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.stereotype.Component;

@Component("dbConnect")
public class DbConnect {

	Connection dbConnection;

	Statement statement;

	void connectToDb() {
		try {
//			Load the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");

//			Connect to the database
			dbConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "April@2304");

//			Get a reference to the Statement object
			//sending sql statements to the database
			statement = dbConnection.createStatement();

			System.out.println("Connected to the database...");

		} catch (ClassNotFoundException e) {
			System.out.println("Driver not found : " + e.getMessage());
		} catch (SQLException e) {
			System.out.println("Can't connect to the database: " + e.getMessage());
		}
	}

//	Fetch all employees from table:employee
	void getAllEmployees() {
//		Write the query to execute
		String qry = "select * from empdetails";
		try {

//			Execute the query
			ResultSet resultSet = statement.executeQuery(qry);

//			 Traverse the data
			System.out.println("Registered employees :");
			while (resultSet.next()) {
				System.out.println("Name : " + resultSet.getString("empName") + ", ID : " + resultSet.getInt("empId")
						+ ", Work location : " + resultSet.getString("empLocation"));
			}
		} catch (SQLException e) {
			System.out.println("Issues while fetching data: " + e.getMessage());
		}
	}

//	Add an employee
	void addNewEmployee(Employee employee) {
//		Write the query to insert
		String qry = "insert into empdetails values(" + "'" + employee.name() + "'," + "'" + employee.id() + "'," + "'"
				+ employee.workLocation() + "')";

		try {
			if (statement.executeUpdate(qry) > 0)
				System.out.println("Registered the employee");
		} catch (SQLException e) {
			System.out.println("Issues while inserting : " + e.getMessage());
		}

	}

	void updateEmployee(Employee emp) {
		// write the query to update a particular record by using ID

		String qry = "update employee.empdetails set "
				+ "empName =" + "'" + emp.name() + "'," 
				+ "empLocation=" + "'"+ emp.workLocation() 
				+ "' " + "where empId=" + "'" + emp.id() + "'";


		
		/*  
		 * 
		 * 
		 * 
		 * 
		 */

		try {
			if (statement.executeUpdate(qry)>0)
				System.out.println("Updated the employee");
			System.out.println(statement.executeUpdate(qry));
		} catch (SQLException e) {
			System.out.println("Issues while inserting : " + e.getMessage());
		}

	}
	
	void deleteEmployee(Integer id) {
		String qry="delete from empdetails where"+" empId="+"'"+id+"'";
		try {
			if (statement.executeUpdate(qry)>0)
				System.out.println("Deleted the employee");
		} catch (SQLException e) {
			System.out.println("Issues while inserting : " + e.getMessage());
		}
		
	}

}
