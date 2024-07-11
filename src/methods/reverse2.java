package methods;

import java.util.Scanner;

public class reverse2 {

	public static void main(String[] args) {
	
Scanner scaaner=new Scanner(System.in);
System.out.println("Enter a number:");
int num=scaaner.nextInt();
int reversedNum=0;
while(num !=0)
{
	int digit=num % 10;
	reversedNum = reversedNum * 10 + digit;
	num /=10;
	
}
System.out.println("Reversed number:"+reversedNum);

	}

}
