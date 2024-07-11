package Ranjithqs;

public class swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String aa1="how";
String aa2="are";

aa1=aa1+aa2;
aa2=aa1.substring(0,aa1.length()-aa2.length());
aa1=aa1.substring(aa2.length());

System.out.println("swapping");
System.out.println("String aa1:"+aa1);
System.out.println("String aa2:"+aa2);

	}

}
