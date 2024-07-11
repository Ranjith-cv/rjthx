package Oopspkg;
abstract class car
{
	abstract public void acceleration();
	abstract public void speedlimit();
	public void carcolour()
	{
		System.out.println("black");
	}
	}
class kia extends car
{

	@Override
	public void acceleration() {
		// TODO Auto-generated method stub
		System.out.println("kia acceleration");
	}

	@Override
	public void speedlimit() {
		// TODO Auto-generated method stub
		System.out.println("speedlimit kia");
	}
	
}
class bmw extends car
{

	@Override
	public void acceleration() {
		// TODO Auto-generated method stub
		System.out.println("bmw acceleration");
	}

	@Override
	public void speedlimit() {
		// TODO Auto-generated method stub
		System.out.println("speedlimit bmw");
	}
	
}


public class Abstractclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
kia ob=new kia();
ob.acceleration();
ob.speedlimit();
ob.carcolour();

bmw ob1=new bmw();
ob1.acceleration();
ob1.carcolour();
ob1.speedlimit();
	}

}
