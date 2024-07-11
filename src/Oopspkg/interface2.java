package Oopspkg;
interface tvremote
{
	public void tv();
}
interface smarttv extends tvremote
{
	
}
class tv implements smarttv
{

	@Override
	public void tv() {
		// TODO Auto-generated method stub
		System.out.println("hd quality");
	}
	
}

public class interface2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
smarttv ob=new tv();
ob.tv();
	}

}
