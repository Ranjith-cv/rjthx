package arraypkge;

import java.util.Scanner;

public class Multidimensional {

	public static void main(String[] args) {
		int[][] ar=new int[3][2];
		System.out.println("enter numbers");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)           // nested loop used for columns and rows
			{
				ar[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
	}

}
