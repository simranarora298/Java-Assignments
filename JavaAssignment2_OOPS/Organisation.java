
public class Organisation {

	public static void main(String[] args) {
		Employee emp1 = new Employee(1,"Sam",2000);
		emp1.salary();
		Employee emp2 = new Manager(2,"Raj",2500,50);
		emp2.salary();
		Employee emp3 = new Labour(3,"Ram",1500,20);
		emp3.salary();
	}
}

class Employee {
	
	int id;
	String name;
	int baseSalary;
	
	public Employee(int id, String name, int baseSalary) {
		this.id = id;
		this.name = name;
		this.baseSalary = baseSalary;
	}


	public void salary() {
		System.out.println(name+" salary is $" + baseSalary);
	}
}

class Manager extends Employee {
	
	int incentive;
	
	public Manager(int id, String name, int baseSalary ,int incentive) 
	{
		super(id, name, baseSalary);
		this.incentive=incentive;
	}

	@Override
	public void salary() {
		System.out.println(name +"(manager) salary is $" + (incentive + baseSalary));
	}
}

class Labour extends Employee {
	
	int overTime;

	public Labour(int id, String name, int baseSalary , int overTime) 
	{
		super(id, name, baseSalary);
		this.overTime=overTime;
	}

	@Override
	public void salary() {
		System.out.println(name +"(labour) salary is $" + (overTime + baseSalary));
	}
}
