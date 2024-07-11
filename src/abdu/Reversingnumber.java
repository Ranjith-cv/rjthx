package abdu;

import java.util.Scanner;

public class Reversingnumber {
	public static void main(String[] args) {
		System.out.println("enter a number");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int temp=a;
		int rev=0,rem;
		while(a>0)	//256>0
		{
			rem=a%10;	//256%10=6 (rem=6 aayi)
			rev=rev*10+rem; //0*10+6=6 (rev=6 aayi)
			a=a/10; //256/10=25 (a=25 aayi)
			
			
		}
		System.out.println(rev);
		if(rev==temp)
		{
			System.out.println("it is palindrome");
		}
		else
		{
			System.out.println("its not plaindrome");
		}
	}
	

}
