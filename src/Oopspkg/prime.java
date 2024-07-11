package Oopspkg;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=8,flag=0;
for( int i=2;i<=num/2;++i)
{
	if(num % i ==0)
	{
		flag=1;
		break;
	}
}
	if(flag==1)
	{
		System.out.println(num+"number is prime");
	}
	
	else
	{
		System.out.println(num+"number is not prime");
	}
	}
	

}
