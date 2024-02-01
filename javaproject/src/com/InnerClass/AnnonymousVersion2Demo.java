package com.InnerClass;

public class AnnonymousVersion2Demo {

	public static void main(String[] args) {
		
		new Sub().fun(new Remote() {
			
//			@Override
			public void workFromHome() {
				// TODO Auto-generated method stub
				System.out.println("It is truly magical........");
				
			}
		});

	}

}

interface Remote{
	void workFromHome();
}

class Sub{
	
	void fun(Remote ref) {
		ref.workFromHome();
	}
}