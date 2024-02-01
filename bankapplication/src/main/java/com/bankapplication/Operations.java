package com.bankapplication;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class Operations {
	
	DataSource dataSource;
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	JdbcTemplate jdbcTemplate;
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
		namedParameterJdbcTemplate=new NamedParameterJdbcTemplate(dataSource);
		jdbcTemplate=new JdbcTemplate(dataSource);
	}
	
	// registering the user
	
	int registerUser(UserDetails user) {
		String qry="insert into userinfo values (:id,:name,:email,:password)";
		MapSqlParameterSource source=new MapSqlParameterSource()
				.addValue("id", user.getId())
				.addValue("name", user.getName())
				.addValue("email", user.getEmail())
				.addValue("password", user.getPassword());
		return namedParameterJdbcTemplate.update(qry, source);
				
	}
	
	
	Float depositing(Float depositBalance, Integer id) {
		
	String qry="select balance from moneydetails where id=";
	MapSqlParameterSource source=new MapSqlParameterSource()
			.addValue("id", id);
	Float balance=jdbcTemplate.queryForObject(qry,Float.class,source);
	return balance+depositBalance;
	
	}
	
	

}
