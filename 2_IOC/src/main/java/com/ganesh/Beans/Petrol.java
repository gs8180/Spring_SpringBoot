package com.ganesh.Beans;

public class Petrol implements Engine
{

	@Override
	public void start() {
		System.out.println("Petrol Class Object Started");
		
	}

	@Override
	public void stop() {
		System.out.println("Petrol Class Object stop");
		
	}
	

}
