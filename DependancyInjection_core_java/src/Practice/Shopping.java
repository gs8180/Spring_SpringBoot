package Practice;

public class Shopping 
{
	Payment p;
	
//	Shopping(Payment p)
//	{
//		System.out.println("Constructor Injection..");
//		this.p=p;
//	}
	public void set(Payment p)
	{
		System.out.println("Setter Injection..");

		this.p=p;
	}
	
	void makePayment()
	{
		if(p !=null)
		{	
			
			p.dopayment();
		}
		else {
			System.out.println("Payment method not selected..");
		}
	}

}
