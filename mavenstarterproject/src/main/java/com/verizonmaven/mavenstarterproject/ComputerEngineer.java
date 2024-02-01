package com.verizonmaven.mavenstarterproject;

import java.util.List;

public class ComputerEngineer implements Engineer {

	private String engName;
	private String engSkills;
	private Integer engId;
	private List<Address> address;

	

	@Override
	public String toString() {
		return "ComputerEngineer [engName=" + engName + ", engSkills=" + engSkills + ", engId=" + engId + ", address="
				+ address + "]";
	}

	public ComputerEngineer(String engName, String engSkills, Integer engId, List<Address> address) {

		this.engName = engName;
		this.engSkills = engSkills;
		this.engId = engId;
		this.address = address;
	}

	ComputerEngineer() {

	}

	public String getEngName() {
		return engName;
	}

	public void setEngName(String engName) {
		this.engName = engName;
	}

	public String getEngSkills() {
		return engSkills;
	}

	public void setEngSkills(String engSkills) {
		this.engSkills = engSkills;
	}

	public Integer getEngId() {
		return engId;
	}

	public void setEngId(Integer engId) {
		this.engId = engId;
	}

	@Override
	public void workForWages() {
		System.out.println(this);
		System.out.println("Working for the wages_C_S_E.....");
	}

}
