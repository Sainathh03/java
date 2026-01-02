package com.tnsif.intro.day10;

public class multidimentionalarray {

	public static void main(String[] args) {
		int [][] nums = new int [2][3];
		
		//nums[0][0]=100;
		//nums[0][1]=200;
		
		for(int i=0;i<3;i++) //rows
		{
			for(int j=0;j<2;j++) //col
			{
			  nums[i][j]=(int)(Math.random()*10);
			  System.out.print(nums[i][j]+"");
			}
			System.out.println();
			
		}
	}
}

		
		//char[] stud = new char[3];
		//stud[0]='c';
		//stud{1]='s';
		
	