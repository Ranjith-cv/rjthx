package methods;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		System.out.println("enter a string");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		Vowels v=new Vowels();
		v.vowelcount(s);
	}
		public void vowelcount(String s)
		{
			int count=0;
			for(int i=0;i<s.length();i++)
			{
		if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='u'||s.charAt(i)=='o') {
			count=count+1;
			
		}
			

			}
			System.out.println(count);
		}
		

}
