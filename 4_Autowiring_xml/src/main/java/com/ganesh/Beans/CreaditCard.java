package com.ganesh.Beans;

public class CreaditCard implements Payment

{

	public CreaditCard() {
		System.out.println("Creditcard obj created..");
	}

	@Override
	public void doPayment(int amt) {
		System.out.println("pay by creditCard..."+amt);
		
	}
	
}
