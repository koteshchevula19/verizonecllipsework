package com.optionaldemo;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		Animals animal=new Animals(101, "kangaroo","kan1");
		
//		String animalName=animal.name();
//		System.out.println(animalName.toUpperCase());
//		
		Optional<String> optionalName = Optional.of(animal.name());
		System.out.println(optionalName);
	}
}
