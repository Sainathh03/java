package com.tnsif.intro.day10;

public class jaggedarray {

	public static void main(String[] args) {
		/*int[][] jagged = new int[3][];
		jagged[0] = new int[3]; //1st row 3 coloums
		jagged[0] = new int[4];
		jagged[0] = new int[2];*/
		
		int[][] jagged = {{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<jagged[i].length;j++)
			{
				System.out.print(jagged[i][j]);
			}
			System.out.println();
			
		}
	}

}
