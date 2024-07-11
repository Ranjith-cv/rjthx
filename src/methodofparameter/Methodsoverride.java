package methodofparameter;

class shape
{
	public void draw()
	{
		System.out.println("draw any shape");
	}
}

class circle extends shape
{

	@Override
	public void draw() {
	System.out.println("shape is circle");
	super.draw();
	}
	
}

public class Methodsoverride {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
circle ob=new circle();
ob.draw();
	}

}
