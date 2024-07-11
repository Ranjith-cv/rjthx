package methodofparameter;

public class mmpara {

	public static void main(String[] args) {
	
		
		mmpara ob=new mmpara();
		ob.add();
		ob.add(20,30);
		ob.add(20, 8.5);
		
}
public void add()
{
	int a=30,b=20;
	int c=a+b;
	System.out.println(c);
}
public void add(int a,int b)
{
	int c=a+b;
	System.out.println("c="+c);
	
}

public void add(int a,double b)
{
	double c=a+b;
	System.out.println(c);
}
public void add(double a,int b)
{
double c=a+b;
System.out.println(c);
}

	

}
