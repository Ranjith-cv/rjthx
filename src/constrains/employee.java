package constrains;

import abdu.Accessmodifier2;

public class employee {
	int empid;
	String empname;
	String qualification;
	static String companyname="infopark";
	
	public employee(int empid,String empname,String qualification)
	{
		this.empid=empid;
		this.empname=empname;
		this.qualification=qualification;
	}

	public static void main(String[] args) {
		employee emp=new employee(121,"abdu","bca");
		System.out.println(emp.empid);
		System.out.println(emp.empname);
		System.out.println(emp.qualification);
	

	}

}
