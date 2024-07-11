package abdu;

import java.util.Scanner;

public class qs5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] ar= new int[7];
		int temp;
		System.out.println("enter the numbers");
Scanner sc=new Scanner(System.in);
for(int i=0;i<7;i++) {
	ar[i]=sc.nextInt();
	
}
for (int i = 0; i<ar.length; i++) {
	temp=ar[0];
    if (ar[i] > temp) 
    {
       temp = ar[i];
       
    }
    System.out.println(temp);
}
	}

}
