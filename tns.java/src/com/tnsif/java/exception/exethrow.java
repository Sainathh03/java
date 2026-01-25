package com.tnsif.java.exception;

public class exethrow {

	public static void main(String[] args) {
		int age =12;
		if(age>18);
		{
			System.out.println("Eligible for voting");
	
		}
	
		{
		throw new ArithmeticException("The age is <18 so not eligible for voting");
		}
			

	}

}
