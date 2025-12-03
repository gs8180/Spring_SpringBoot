package com.scopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestScope 
{
	public static void main(String[] args) {
		ApplicationContext ctxt=new ClassPathXmlApplicationContext("Bean.xml");
		Employee e1=ctxt.getBean(Employee.class);
		Employee e2=ctxt.getBean(Employee.class);
		
		if(e1==e2) 
		{
			System.out.println("both are equal");
			System.out.println(e1);
			System.out.println(e2);
		}
		else {
			System.out.println("both are different ");
			System.out.println(e1);
			System.out.println(e2);
		}
		
	}

}
