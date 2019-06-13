package com.hdfc.loans.carloans;

public class FirstClass {

	int a=10, b=30, c;
	
	void add()
	{
		c = a+b;
		System.out.println("addition of a and b is " + c);
	}
	void sub ()
	{
		c=b-a;
		System.out.println("subtraction of b and a is " + c);
		
	}
	public static void main(String[] args) {

		System.out.println("HI");
		
		FirstClass obj = new FirstClass();
		obj.add();
		obj.sub();
	}

	
	
}
