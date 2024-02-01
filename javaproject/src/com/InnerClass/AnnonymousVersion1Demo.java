package com.InnerClass;

public class AnnonymousVersion1Demo {
public static void main(String[] args) {
	
//	I have to call Footballer's play()
	Footballer footballer = new Footballer() {
		@Override 
		public void play() 
		{
			System.out.println("Magical this...");
			}
		
		};
		footballer.play();
		
		// we can write in another way the same code :
		
//		 new Footballer() {
//			@Override 
//			public void play() 
//			{
//				System.out.println("Magical this...");
//				}
//			
//			}.play();

//	1. Creating a annonymous class which happens to be a subclass of Footballer 
//  -. It seems we are creating an object for Interface but not look carefully..	
//  -. We are implementing that interface to annonymous Inner Class and implementing the abstract ethods of the interface;
//	2. Overrding play()
//	3. writing the logic in play()
//	4. closing the play()
//	5. Closing the annonymous class declaration
//	6. Creating a reference varaible of super type : Footballer
//	7. Creating an object of that annonymous class
//	8. Assigning the sub class object reference to super type ref variable
//	9. Closing the statement
	

	
}
}




@FunctionalInterface
interface Footballer{
	void play();
}





