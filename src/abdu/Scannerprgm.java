package abdu;

import java.util.Scanner;

public class Scannerprgm {

	public static void main(String[] args) {
		int choice;	//added choice 
		do {	//used dowhile
		System.out.println("enter a number");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();  //(should add two)
		int b=sc.nextInt();
		System.out.println("enter your choice:1.add 2:sub 3:mult 4:div");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:System.out.println(a+b);
		break;
		case 2:System.out.println(a-b);
		break;
		case 3:System.out.println(a*b);
		break;
		case 4:System.out.println(a/b);
		break;
		default:System.out.println("invalid choice");
		}
		}while(choice>0 && choice<=4);//added while (&& it is used for adding conditions)
	}

}
