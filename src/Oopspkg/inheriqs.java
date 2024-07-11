package Oopspkg;
class member
{
	String name;
	int age;
	String phonenumber;
	String address;
	int salary;
	public void printdetails()
	{
		System.out.println("Name="+name);
		System.out.println("Age="+age);
		System.out.println("Phonenumber="+phonenumber);
		System.out.println("Address="+address);
		System.out.println("Salary="+salary);
	}
}
class employee extends member
{
	String specialization;
}
class manager extends member
{
	String department;
}

public class inheriqs {

	public static void main(String[] args) {
		
		employee ob=new employee();
		ob.name="abdu";
		ob.address="sk";
		ob.age=23;
		ob.salary=0;
		ob.phonenumber="8200987002";
		ob.printdetails();
		System.out.println(ob.specialization="Development");

	}

}
