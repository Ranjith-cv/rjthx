package abdu;

import java.util.Scanner;

public class Sumforloop {

	public static void main(String[] args) {
		System.out.println("enter numbers");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=n;
		int r,s=0;
		
		while(n>0)
		{
		r=n%10;
		s=s+r*r*r;
		n=n/10;
		}
		
		if(temp==s)
		{
			System.out.println("armstrong");
		}
		else
		{
			System.out.println("not armstrong");
		}
}
}