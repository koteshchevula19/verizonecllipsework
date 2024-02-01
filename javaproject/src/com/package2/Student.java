package com.package2;

public class Student{ //implements Comparable<Student> {


	private Integer id;

	private String name;

	private String skills;

	public Integer getId() {
		return id;
	}

	public Student(Integer id, String name, String skills) {
		super();
		this.id = id;
		this.name = name;
		this.skills = skills;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	Student() {

	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", skills=" + skills + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		//Custom logic for comparing students here:
		if(obj instanceof Student)
			return this.getSkills().equals(((Student)obj).getSkills());
		else
			return false;
	}

//	@Override
//	public int compareTo(Student std) {
//		return std.getName().compareTo(this.getName());
//	}


	

}
