package Ranjithqs;

public class swapping3 {

	public static void main(String[] args) {
		
		
		String b1="i am";
		String b2="king ";
		
		
		System.out.println("before swapping");
		System.out.println("String b1:"+b1);
		System.out.println("Strin b2:"+b2);
		
		b1=b1+b2;
		b2=b1.substring(0,b1.length()-b2.length());
		b1=b1.substring(b2.length());
		
		
		System.out.println("after swapping");
		System.out.println("String b1:"+b1);
		System.out.println("String b2:"+b2);
		
	}

}
