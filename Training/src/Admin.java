
public class Admin {
	
	public static int MIN_AGE_TO_VOTE=18;
	public static int MIN_AGE_TO_DRIVE=18;
	public static int MIN_AGE_FOR_MAN_TOGET_MARRIED=21;
	public static int MIN_AGE_FOR_GIRL_TOGET_MARRIED=18;
	public static void main(String args[])
	{
		Person meena=new Person("sriram",Person.Female,18);
		Person jeet=new Person("jeet",Person.Male,21);
		Employee navjeet=new Employee("jeet",Person.Male,19,"Pramati");
		meena.print();
		jeet.print();
		navjeet.print();
		
	}
}
