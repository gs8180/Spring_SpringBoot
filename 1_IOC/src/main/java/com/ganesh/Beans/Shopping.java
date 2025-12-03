package com.ganesh.Beans;

public class Shopping 
{
	Payment pay;
	
	
	public Shopping(Payment pay)
	{
		System.out.println("i am in constroctor injection");
		this.pay=pay;
	}
	public void setPay(Payment pay) {
		this.pay = pay;
	}



	void doPayment(int amt)
	{
		if(pay !=null)
		{
			pay.doPayment(amt);
		}
		else {
			System.out.println("No Payment method Selected...");
		}
	}
}
