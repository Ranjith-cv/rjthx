package methods;

public class methodpr {

	public static void main(String[] args) {
	methodpr ob=new methodpr();
	ob.add();
int value=ob.sub();
System.out.println("substraction="+value);		
ob.mul(23,30);
double dev=ob.dev(30,6);
System.out.println("Devision="+dev);

	}
	public void add()
	{
		int a=34,b=40,c;
		c=a+b;
		System.out.println(c);
	}
	public int sub()
	{
	int a=30,b=20,c;
	c=a-b;
	return c;
	}
	public void mul(int a,int b)
	{
		int c=a*b;
		System.out.println("multiplication="+c);
		
	}
	public double dev(int a,int b)
	{
	double c=a/b;
	return c;
	}
}
