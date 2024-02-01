package com.optionaljava8feature;

public record Student(Integer id,String name,String email,String password) {

	public void m1() {
		System.out.println("M1 method called");
	}
}
