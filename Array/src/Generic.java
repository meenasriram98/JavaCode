import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class Generic<T> {
	private T t;
	
	public void get()
	{
		System.out.println(this.t);
	}
	
	public void set(T t)
	{
		this.t=t;
	}
	
	
	public static void main(String[] args)
	{
		Integer[] numbers= {1,2,3,4,5,6,7,8};
		Double[] nums= {1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0};
		Generic<String> object=new Generic<>();
		object.set("meena");
		object.get();
		
		Generic object2= new Generic();
		object2.set("sriram");
		object2.get();
		
		Stats<Integer> average=new Stats<>(numbers);
		Double result=average.average();
		System.out.println(result);
		
		Stats<Double> average1=new Stats<>(nums);
		Double result1=average.average();
		System.out.println(result1);
		
		boolean isEqual= average1.sameAverage(average);
		System.out.println(isEqual);
		
		//sorting using comparator
		
		List<Employee> employee=new ArrayList<>();
		employee.add(new Employee(123,"meena",123456));
		employee.add(new Employee(1234,"sriram",1256));
		employee.add(new Employee(123,"keerti",12356));
		
		//comparator of type employee
		
		Comparator<Employee> employeeComparator=new Comparator<Employee>()
		{

			@Override
			public int compare(Employee emp1, Employee emp2) {
				return emp1.getEmpName().compareTo(emp2.getEmpName());
			}
			
		};
		
		Collections.sort(employee,employeeComparator);
		for (Employee employee2 : employee) {
			System.out.println(employee2.getEmpName());
		}
		
		//sorting using comparable 
		
		List<Car> car=new ArrayList<>();
		car.add(new Car("honda",2134565,2009));
		car.add(new Car("maruti",7262548,2019));
		car.add(new Car("hundai",87346827,2015));
		Collections.sort(car);
		
		for (Car car2 : car) {
			System.out.println(car2.getBrand()+":"+car2.getYear());
		}
	}
}
