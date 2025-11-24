package com.ganesh.Beans;

public class DebitCard implements Payment
{

	DebitCard(){
		System.out.println("Debitcard obj created..\"");
	}

	@Override
	public void doPayment(int amt) {
		System.out.println("pay by DebitCard.."+amt);
		
	}
	

}
