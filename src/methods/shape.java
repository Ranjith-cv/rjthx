package methods;

public class shape {

	public static void main(String[] args) {
	shape ob=new shape();
	ob.rect();
	int value=ob.circ();
	System.out.println("circle="+value);
double e=ob.train(30,35);
System.out.println("triangle="+e);
	ob.squa(40,25);
	System.out.println("square="+value);

	}
	public void rect()
	{
		int a=29,b=23,c;
		c=a*b;
		System.out.println("area of the rectangle="+c);
		
	}
	public int circ()
	{
	int a=25,b=10,c;
	c=a-b;
	return c;
	}
	public double train(int a,int b)
	{
		double c=a/b;
		return c;
	}
	public void squa(int a,int b)
	{
		int c=a*b;
		
	}
	
	
}
