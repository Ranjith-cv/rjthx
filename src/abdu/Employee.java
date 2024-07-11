package abdu;

public class Employee {
	int empid; // 1)instance variable
	String Empname;
	String designation;
	static String companyname="LUMINAR";// 2)static varaiable

	public static void main(String[] args) {
		Accesmodifiers ob=new Accesmodifiers();
		Employee emp=new Employee();
		emp.empid=101;
		emp.Empname="abdu";
		System.out.println(emp.Empname);
		System.out.println(companyname);//  without object we can declare like this using(static)
	
		

	}
	public void bonusdetails()
	{
		int a;// 3)local variable
	}
}
