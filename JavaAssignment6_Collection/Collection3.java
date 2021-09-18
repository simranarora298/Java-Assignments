package capg.co;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Collection3 
{
	public static void main(String[] args) 
	{
		
		Employee e1=new Employee(1,"Himan","HR",2500);
		Employee e2=new Employee(2,"Rohit","Marketing",2100);
		Employee e3=new Employee(3,"Ayush","Finance",1200);
		Employee e4=new Employee(4,"Siv","IT",1500);
		
		Set<Employee> treeSet=new TreeSet<>();

		treeSet.add(e1);
		treeSet.add(e2);
		treeSet.add(e3);
		treeSet.add(e4);
		
		List<Employee> arrayList = new ArrayList<>(treeSet);
		
		System.out.println("Select on which basis you want to sort the data:");
		System.out.println("1. ID");
		System.out.println("2. Name");
		System.out.println("3. Department");
		System.out.println("4. Salary");
		
		Scanner sc=new Scanner(System.in);
		int select=sc.nextInt();
		
		switch(select) 
		{
			case 1 : Collections.sort(arrayList, new Comparator<Employee>()
				{
					@Override
					public int compare(Employee o1,Employee o2){
					return o1.id-o2.id;
					}	
				});
				break;
		case 2 : Collections.sort(arrayList, new Comparator<Employee>()
			{
				@Override
				public int compare(Employee o1,Employee o2){
				return o1.name.compareTo(o2.name);
				}
			});
			break;
		
		case 3 : Collections.sort(arrayList, new Comparator<Employee>()
			{
				@Override
				public int compare(Employee o1,Employee o2){
				return o1.dept.compareTo(o2.dept);
				}	
			});
			break;
			
		case 4 : Collections.sort(arrayList, new Comparator<Employee>()
			{
				@Override
				public int compare(Employee o1,Employee o2){
				return o1.sal-o2.sal;
				}	
			});
			break;
			
		default : System.out.println("Wrong input");
	}
		
	Iterator<Employee> itr=arrayList.iterator();
		
		while(itr.hasNext())
			System.out.println(itr.next());
		
		
	}

}

class Employee implements Comparable<Employee>
{
	int id;
	String name;
	String dept;
	int sal;
	
	public Employee(int id, String name, String dept, int sal) 
	{
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.sal = sal;
	}
	
	@Override
	public String toString() 
	{
		return id + "\t" + name + "\t" + dept + "\t" + sal;
	}
	
	@Override
	public int compareTo(Employee e) 
	{
		if(this.id==e.id)
			return 0;
		else if(this.id>e.id)
			return 1;
		else 
			return -1;
	}
}