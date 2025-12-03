package com.ganesh.Beans;

public class Shopping 
{
	Payment pay;
	
	public Shopping(Payment pay)
	{
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
