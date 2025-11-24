package Practice;

public class Customer {

	public static void main(String[] args) 
	{
		CashPyment c=new CashPyment();
		DebitCard dc=new DebitCard();
		CreditCard cc=new CreditCard();
		
		Shopping sh=new Shopping(); //Constructor injection
		sh.p=dc;  //field injection
		//sh.set(cc);  // setter injection
		sh.makePayment();
		

	}

}
