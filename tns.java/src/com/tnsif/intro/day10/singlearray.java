package com.tnsif.intro.day10;

public class singlearray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		// System.out.println(arr[6]);
	
        int[] num = new int[3];
        num[0] = 100;
        num[1] = 200;
        num[2] = 300;
        for(int i=0;i<=2;i++)
        {
        	System.out.println(num[i]);
        }
      
	}

}
