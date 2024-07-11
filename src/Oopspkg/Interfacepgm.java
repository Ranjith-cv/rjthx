package Oopspkg;
interface basicanimal
{
	public void eat();
	public void sleep();
	
}

class monkey implements basicanimal
{
	
@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("bite");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("jump");
	}
}
class humon extends monkey
{
	public void speak()
	{
		System.out.println("humonspeak");

	}
}

public class Interfacepgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
basicanimal ob=new monkey();
ob.eat();
ob.sleep();
humon ob1=new humon();
ob1.speak();
	}

}
