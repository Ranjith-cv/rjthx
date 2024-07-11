package abdu;
class vehicle
{
	public void drive()
	{
		System.out.println("drive vehicle");
	}
}
class car extends vehicle
{

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("repairing a car");
	}
	
	
		
	
}
public class qs4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
car ob=new car();
ob.drive();
	}

}
