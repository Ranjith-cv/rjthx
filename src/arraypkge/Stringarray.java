package arraypkge;

import java.util.Scanner;

public class Stringarray {

	public static void main(String[] args) {
		
String[] st=new String[3];
System.out.println("enter characters");
Scanner sc=new Scanner(System.in);
for(char i=0;i<3;i++)
{
	st[i]=sc.next();
}
System.out.println("entered the characters");
for(char i=0;i<3;i++)
{
	System.out.println(st[i]);
}
	}

}
