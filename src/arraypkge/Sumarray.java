package arraypkge;

import java.util.Scanner;

public class Sumarray {

	public static void main(String[] args) {
		int[] ar=new int[5];
		System.out.println("enter numbers");
		Scanner sc=new Scanner(System.in);
		int sum=0;
		for(int i=0;i<5;i++)
		{
			ar[i]=sc.nextInt();
			sum=sum+ar[i];
		}
System.out.println("total="+sum);

	}

}
