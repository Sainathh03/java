package com.tnsif.intro.day10;

public class enhancedarray {

	public static void main(String[] args) {
		int[][] jagged = {{1,2,3},{4,5,6},{7,8,9}};
		
		for(int[] i : jagged)
		{
			for(int j : i)
			{
				System.out.print(j+"");
			}
			System.out.println();
			
		}
	}

}
