package methods;

import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter a number: ");
	        int num = scanner.nextInt();
	        int reversedNum = 0;
	        
	        while(num != 0) {
	            int digit = num % 10;
	            reversedNum = reversedNum * 10 + digit;
	            num /= 10;
	        }
	        
	        System.out.println("Reversed Number: " + reversedNum);

	}

}
