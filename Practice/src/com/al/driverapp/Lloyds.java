package com.al.driverapp;

public class Lloyds implements Boi
{

	public static void main(String[] args) {


		Lloyds l = new Lloyds();
		l.deposit();
		l.withdrawl();
		
	}

	@Override
	public void deposit() {
		
		System.out.println("overrided deposit in Lloyds");
	}

	@Override
	public void withdrawl() {

		System.out.println("overrided withdrawl in Lioyds");
	}

}
