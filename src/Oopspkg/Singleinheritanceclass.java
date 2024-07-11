package Oopspkg;




class parent

{
	public void parentmethod()
	{
		System.out.println("parentmethod");
	}
}

class child extends parent
{
	public void childmethod()
	{
		System.out.println("childmethod");
	}
}
public class Singleinheritanceclass {

	public static void main(String[] args) {
		
		
		child ob=new child();
		ob.parentmethod();
		ob.childmethod();

	}

}
