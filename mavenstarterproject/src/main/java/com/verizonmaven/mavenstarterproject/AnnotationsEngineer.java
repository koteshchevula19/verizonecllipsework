package com.verizonmaven.mavenstarterproject;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;



@Component("anEngineer")
@PropertySource("classpath:test.properties")
public class AnnotationsEngineer implements Engineer {
	
	@Autowired
	Address address;
	

	@Autowired
	List<String> listOfNames;
	
	@Value("${eng.name}")
	String engName;
	
	@Value("${eng.skills}")
	String engSkills;
	
	
	
	
	public AnnotationsEngineer() {
		
	}
	
//	For Contructor DI
//	@Autowired
//	public AnnotationsEngineer(Address address) {
//		this.address = address;
//	}


	

	
//	For Setter DI
//	@Autowired
//	@Qualifier("otherAddress")
//	public void setAddress(Address address) {
//		this.address = address;
//	}
	
	

	@Override
	public void workForWages() {
			System.out.println(this);
	}

	@Override
	public String toString() {
		return "AnnotationsEngineer [address=" + address + ", listOfNames=" + listOfNames + ", engName=" + engName
				+ ", engSkills=" + engSkills + "]";
	}

}

