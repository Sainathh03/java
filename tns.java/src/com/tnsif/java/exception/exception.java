package com.tnsif.java.exception;

import javax.crypto.ShortBufferException;
import javax.security.auth.login.AccountNotFoundException;

public class exception {

	public static void main(String[] args) {
		try {
			int a ,b;
			a=10;
			b=0;
			int c=a/b;
			
			int[] arr= {1,2,3,4,5};
			System.out.println(arr[0]);
			System.out.println(arr[5]);
			
			String s=null;
			System.out.println(s.length());
		} 
		
		catch(ArithmeticException e)
		{
			System.out.println("The division is not possible");
			
		}
		catch(IndexOutOfBoundsException e1)
		{
			System.out.println("You cant read the value of arr[5]");
			
		}
		catch(NullPointerException e)
		{
			System.out.println("The string value is null");
		}
		
	}

}
