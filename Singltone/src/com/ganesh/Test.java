package com.ganesh;

class Student{
	static Student s;
	 private Student()
	{
		System.out.println("student obj created");
	}
	static {
		s=new Student();
	}
	static Student getObject()
	{
		return s;
	}
}

public class Test{
	public static void main(String[] args)
	{
		Student s1=Student.getObject();
		Student s2=Student.getObject();
		
		System.out.println(s1+"\n "+s2);
		
	}
}