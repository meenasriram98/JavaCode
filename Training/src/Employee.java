
public class Employee extends Person{
	private String companyName;
	
	Employee(String name,String gender,int age,String companyName)
	{
		super(name,gender,age);
		this.companyName=companyName;
	}
	
	public String GetCompanyName()
	{
		return companyName;
	}
	
	public void print(Employee emp)
	{
		super.print();
		System.out.println(emp.companyName);
	}
}
