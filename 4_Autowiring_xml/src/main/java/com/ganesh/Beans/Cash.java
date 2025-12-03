package com.ganesh.Beans;

public class Cash implements Payment
{
	
	public Cash()
	{
		System.out.println("Cash obj created..");
	}

	@Override
	public void doPayment(int amt) {
		System.out.println("pay by cash..."+amt);
		
	}
		
	
}
