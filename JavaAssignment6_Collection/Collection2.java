import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class Collection2 
{
	public static void main(String[] args) 
	{
		Set<Product> hashSet = new HashSet<>();
		
		Product p1=new Product(1,"Chocolate");
		Product p2=new Product(2,"Icecream");
		Product p3=new Product(3,"Cookie");
		Product p4=new Product(2,"Candy");
		Product p5=new Product(3,"Cookie");
		hashSet.add(p1);
		hashSet.add(p2);
		hashSet.add(p3);
		hashSet.add(p4);
		hashSet.add(p5);
		
		Iterator<Product> itr = hashSet.iterator();
		while(itr.hasNext()) 
		{
			System.out.println(itr.next());
		}
	}
}

class Product
{
	int id;
	String name;
	
	public Product(int id, String name) 
	{
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return id + "\t" + name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return id == other.id && Objects.equals(name, other.name);
	}	
}
