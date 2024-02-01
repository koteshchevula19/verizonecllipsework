package com.verizonmaven.mavenstarterproject;

public class CivilEngineer implements Engineer {
	
	private Address address;

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "CivilEngineer [address=" + address + "]";
	}

	public CivilEngineer(Address address) {
		
		this.address = address;
	}
	
	public CivilEngineer() {
	
	}

	@Override
	public void workForWages() {
		// TODO Auto-generated method stub
		System.out.println("CivilEngineers woks for the wages tooo...");
		System.out.println(this);
		
	}

}
