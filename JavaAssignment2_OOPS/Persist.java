public class Persist 
{
	public static void main(String[] args) 
	{
		Persistance p1 =new FilePersistance();
		p1.persist();
		Persistance p2 =new DatabasePersistance();
		p2.persist();
	}
}

abstract class Persistance
{
	abstract void persist();
}

class FilePersistance extends Persistance
{
	@Override
	void persist() {
		System.out.println("Saved in File");		
	}	
}
class DatabasePersistance extends Persistance
{
	@Override
	void persist() {
		System.out.println("Saved in Database");		
	}	
}