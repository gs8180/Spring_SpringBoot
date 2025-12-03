package Practice;

public class Car 
{
	private Engine e;
	
	public void set(Engine e)
	{
		this.e=e;
	}
	
	Car(Engine e)
	{
		this.e=e;
	}
	
	void drive()
	{
		if(e!=null)
		{
			e.start();
		}
		else {
			System.out.println("Engine not define....");
		}
	}

}
