package com.ganesh.Beans;

public class Car
{
	private Engine e;
	
	public Car(Engine e)
	{
		this.e=e;
	}

	public void setE(Engine e) {
		this.e = e;
	}

	
	void drive()
	{
		if(e!=null)
		{
			e.start();
			System.out.println("Engined started ...");
			e.stop();
		}
	}

}
