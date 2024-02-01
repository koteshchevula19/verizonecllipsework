package com.bankapplication;

import java.sql.Date;

public class MoneyDetails {
	
	private Date date;
	private Integer id;
	private Float balance;
	private String category;
	@Override
	public String toString() {
		return "MoneyDetails [date=" + date + ", id=" + id + ", balance=" + balance + ", category=" + category + "]";
	}
	public MoneyDetails(Date date, Integer id, Float balance, String category) {
		super();
		this.date = date;
		this.id = id;
		this.balance = balance;
		this.category = category;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Float getBalance() {
		return balance;
	}
	public void setBalance(Float balance) {
		this.balance = balance;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	public MoneyDetails() {
		// TODO Auto-generated constructor stub
	}
	

}
