package com.al.driverapp;

public class Halifax implements Boi
{

	public static void main(String[] args) {


		Halifax h = new Halifax();
		h.deposit();
		h.withdrawl();
		
	}

	@Override
	public void deposit() {
		System.out.println("overridden deposit in Halifax");
	}

	@Override
	public void withdrawl() {

		System.out.println("overridden withdrawl in Halifax");
	}

}
