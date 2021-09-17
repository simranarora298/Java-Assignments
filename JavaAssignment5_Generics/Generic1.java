import java.util.HashSet;
import java.util.Set;

public class Generic1 
{
	public static void main(String[] args) 
	{
		Set<Employee> hashSetEmp=new HashSet<>();
		
		Employee emp1 = new Employee(1,"Rahul",2000,"HR");
		Employee emp2 = new Employee(2,"Ravina",1500,"Finance");
		Employee emp3 = new Employee(3,"Ram",1300,"IT");
		
		hashSetEmp.add(emp1);
		hashSetEmp.add(emp2);
		hashSetEmp.add(emp3);

		for(Employee emp:hashSetEmp)
		emp.displayDetails();

	}

}
class Employee
{
	private int id;
	private String name;
	private int salary;
	private String dept;
	
	
	public Employee(int id, String name, int salary, String dept) 
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dept = dept;
	}


	public void displayDetails() 
	{
		System.out.println(id+"\t"+name+"\t"+salary+"\t"+dept);
	}
	
}

