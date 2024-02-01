package com.expensetracker;

import java.sql.Date;
import java.sql.ResultSet;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class TrackingExpenses {

	DataSource dataSource;
	JdbcTemplate jdbcTemplate;
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
		jdbcTemplate=new JdbcTemplate(dataSource);
		namedParameterJdbcTemplate=new NamedParameterJdbcTemplate(dataSource);
	}
	
	// Retrieving the credentials of users 
	List<UserCredntials> retrievingUserCredentilas(){
		String qry="select * from usercredentials";
		return jdbcTemplate.query(qry, 
									(ResultSet rs, int numRows)
									-> new UserCredntials
									(
											rs.getString("userName"),
											rs.getString("password")
											
											)
				
										);
	}
	
	int addExpenses(Expensetracker exps) {
		String qry="insert into expensetracker.expensetrackertable values (:date,:amount,:item,:category)";
		MapSqlParameterSource source=new MapSqlParameterSource()
				.addValue("date", exps.getExtractDate())
				.addValue("amount",exps.getAmount() )
				.addValue("item", exps.getItem())
				.addValue("category",exps.getCategory() );
		return namedParameterJdbcTemplate.update(qry, source);
	}
	
	List<Expensetracker> filteringProuctsBasedOnDate(Date date1,Date date2){
		
		String qry= "select * from expensetracker.expensetrackertable where date between :date1 and :date2";
		
		MapSqlParameterSource source=new MapSqlParameterSource()
				.addValue("date1", date1)
				.addValue("date2", date2);
		
	return	namedParameterJdbcTemplate.query(qry, source, 
			(ResultSet rs, int numRows)
			-> new Expensetracker(
					rs.getDate("date"),
					rs.getFloat("amount"),
					rs.getString("item"),
					rs.getString("category")
					));
	}
	
	Float priceOfAll() {
		String qry="select sum(amount) from expensetracker.expensetrackertable";
	
		return jdbcTemplate.queryForObject(qry, Float.class);
	}
	
	Float priceByCategory(String category) {
		String qry="select sum(amount) from expensetracker.expensetrackertable where category=:category ";
		MapSqlParameterSource source=new MapSqlParameterSource()
				.addValue("category", category);
		return namedParameterJdbcTemplate.queryForObject(qry, source, Float.class);
	}
	
}
