package com.ganesh.Beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
	public static void main(String[] args) 
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		Shopping shop=context.getBean(Shopping.class);
		shop.doPayment(200);
	}
	

}
