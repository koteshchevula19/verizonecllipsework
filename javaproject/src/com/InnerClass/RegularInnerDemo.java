package com.InnerClass;

public class RegularInnerDemo {
public static void main(String[] args) {
	
//	new Outer().out();
	
	Outer out = new Outer();
	Outer.Inner in = out.new Inner();
	in.met();
}
}


class Outer{
	private int value;
    class Inner{
        int value;
        void met(){
        	int value = 10;
           System.out.println("Inside Inner's in...");
           System.out.println("Local value : " + value);
           System.out.println("Instance value : " + this.value);
           System.out.println("Outer's Instance value : " + Outer.this.value);
        }
    }
    
    void func() {
    	Inner ref = new Inner();
    	ref.met();
    }
    
    
    
}
