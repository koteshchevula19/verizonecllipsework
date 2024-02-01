package com.verizonmaven.mavenstarterproject;

public class SampleEngineer implements Engineer {
	
	String name;
	String skills;
	
	public SampleEngineer(String name,String skills) {
		this.name = name;
		this.skills=skills;
	}

	@Override
	public void workForWages() {
		System.out.println(name);
		System.out.println(skills);
	}
	
	public SampleEngineer() {
		// TODO Auto-generated constructor stub
	}

}
