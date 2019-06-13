package com.al.driverapp;

public class SecondClass {
	

	int a=2, b=1, c;
	
	void add() {
		c=a+b;
		System.out.println("addition of a and b is :" + c);
	}
    
	void sub () {
		c=a-b;
		System.out.println("sub of a and b is :" + c);
	}
	
	void mul() {
		c=a*b;
		System.out.println("mul of a and b is :" + c);
	}
	
	public static void main(String[] args) {
		
		SecondClass obj = new SecondClass();
		obj.add();
		obj.sub();
		obj.mul();
		
	}
	}


