package Oopspkg;


class father
{
	public void fathermethod()
	{
		System.out.println("father");
	}
}

class son extends father
{
	public void sonmethod()
	{
		System.out.println("son");
	}
}
class grandson extends son
{
	public void grandsonmethod()
	{
		System.out.println("grandson");
	}
}
public class multievelvl {

	public static void main(String[] args) {
	
		
		grandson ob=new grandson();
		ob.sonmethod();
		ob.grandsonmethod();
ob.fathermethod();
	}

}
