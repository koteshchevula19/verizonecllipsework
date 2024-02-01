package com.verizonmaven.springjdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class JdbcTemplateDemo {

	DataSource dataSource;

	JdbcTemplate jdbcTemplate;
	
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	@Autowired
	public void setDataSource(DataSource dataSource) {
//		jdbcTemplate = new JdbcTemplate(dataSource);
		namedParameterJdbcTemplate=new NamedParameterJdbcTemplate(dataSource);
		
	}

//	Fetch the count of employees
	Integer getNumberOfRegisteredEmployees() {
		String qry = "select count(*) from empdetails";

		return jdbcTemplate.queryForObject(qry, Integer.class);
	}

//	Get employee name by id
	String getEmployeeNameById(Integer id) {
		return jdbcTemplate.queryForObject("select empName from empdetails where empId = ?", String.class,
				new Object[] { id });
	}

//	I Think the below method is not going to work sure you are going to check this method afterwards
//	
//	Employee updateEmployeeNameById(String name,Integer id) {
//		return jdbcTemplate.queryForObject("update empdetails set empName=? where empId=? ",Employee.class ,new Object[] {name,id});
//	}

//	Get employee details by id
	Employee getEmployeeDetailsById(Integer id) {
		String qry = "select * from empdetails where empId = ?";

		return jdbcTemplate.queryForObject(qry, new EmployeeMapper(), new Object[] { id });
	}

//	Create a class which implements RowMapper
	class EmployeeMapper implements RowMapper<Employee> {

		@Override
		public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
			// TODO Auto-generated method stub

			return new Employee(rs.getString("empName"), rs.getInt("empId"), rs.getString("empLocation"));
		}

	}

//	Get all employees

	List<Employee> getAllEmployees() {

		return jdbcTemplate.query("select * from empdetails", new EmployeeMapper());
	}

//	Register a new Employee
	int registerNewEmployee(Employee employee) {
		String qry = "insert into empdetails values(?, ?, ?)";
		return jdbcTemplate.update(qry, new Object[] { employee.name(), employee.id(), employee.workLocation() });
	}

	public int updateEmployeeByUsingId(Employee employee) {

		String qry="update empdetails set " + "empName= ?," + "empLocation= ? " + " where empId= ?";
		return jdbcTemplate.update(qry,
				new Object[] { employee.name(), employee.workLocation(), employee.id() });
	}
	
	int deleteById(Integer id){
		
		return jdbcTemplate.update("delete from empdetails where empId=?", id);
	}
//	using namedparamtersjdbctemplate :
//	gettting the empdetailsById
	Employee getEmployeeDetailsByIdUsingDirectlyNameinThePlaceofPlaceHolders(Integer id) {
		String qry="select * from empdetails where empId=:id";
		 MapSqlParameterSource parameters = new MapSqlParameterSource()
		            .addValue("id",id);
		return namedParameterJdbcTemplate.queryForObject(qry,parameters,new EmployeeMapper());
	}
	
	/*
	 * if you want to pass parameter as multiple or multiple parameters
	 * Employee getEmployeeDetailsByIdUsingDirectlyNameinThePlaceofPlaceHolders(Integer id,String Name){
	 * String qry="select empName=:name from empdetails where empId=:id";
	 *  MapSqlParameterSource parameters = new MapSqlParameterSource()
		            .addValue("id",id).addValue("",).addValue("name",Name);
	 * 
	 * }
	 * 
	 * 
	 */

}
