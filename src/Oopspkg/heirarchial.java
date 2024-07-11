package Oopspkg;


class animal
{
	public void animalmethod()
	{
		System.out.println("animal");
	}
}
class lion extends animal
{
	public void lionmethod()
	{
		System.out.println("lion");
		
	}
}
class tiger extends animal
{
	public void tigemethod()
	{
		System.out.println("tiger");
	}
}
public class heirarchial {

	public static void main(String[] args) {
		
		lion ob=new lion();
		ob.animalmethod();
		ob.lionmethod();
		tiger l=new tiger();
		l.animalmethod();
		l.tigemethod();
	}

}
