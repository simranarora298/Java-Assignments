import java.util.HashMap;
import java.util.Map;

public class Generic2 
{
	public static void main(String[] args) 
	{
		Map<Integer,Double> hashMap = new HashMap<>();
		hashMap.put(1,10.00);
		hashMap.put(2,30.00);
		hashMap.put(3,23.00);
		hashMap.put(4,56.00);
		hashMap.put(5,67.00);
		hashMap.put(6,100.00);
		
		for(Map.Entry<Integer,Double> entry : hashMap.entrySet()) 
		{
			System.out.println(entry.getKey()+"\t"+entry.getValue());
		}
	}
}
