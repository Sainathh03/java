package com.tnsif.intro.thiss;

public class override {
	public void hello()
	{
		System.out.println("this is parent class method");
	}
	
	
}
class child extends override
{
	public void hello()
	{
		System.out.println("this is child class method");
	}
}