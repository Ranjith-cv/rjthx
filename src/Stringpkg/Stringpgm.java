package Stringpkg;

public class Stringpgm {

	public static void main(String[] args) {
		//concat
		String s1="hello";
		String s2="hello";
		String s3=" hi welcome to luminar";
		String s4=new String("HELLO");
		
		System.out.println(s1.concat(s2));
		System.out.println(1+2+s1+3+4);
		
		
		//.equals
		System.out.println(s1.equals(s4)); // looks for if it is same
		System.out.println(s1.equalsIgnoreCase(s4));//it will be equals if it is not albhatic
		
		
		//tolowercase
		//touppercase
		System.out.println(s3.toUpperCase());
		System.out.println(s4.toLowerCase());
		
		//lenght()
		System.out.println(s1.length());
		
		
		//startswith and endswith
		System.out.println(s3.startsWith("hi"));
		System.out.println(s3.endsWith("luminar"));
		
		
		//trim
		System.out.println(s3.trim());
		
		
		//replace
		System.out.println(s3.replace("hi","hello"));
		
		
		//contains
		System.out.println(s3.contains("welcome"));
		
		//split
		String[] ar=s3.split(" ");
		for (String a:ar)
		{
			System.out.println(a);
		}
		
		//substring
		//charAt
		//tochararray
		
		System.out.println(s1.substring(1,2));
		
		System.out.println(s3.charAt(4));
		
		char[] c=s2.toCharArray();
		for(char c1:c)
		{
			System.out.println(c1);
		}
	}

}
