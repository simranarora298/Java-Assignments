package capg.co;

import java.util.Arrays;
import java.util.List;

public class Test12 {
	
	public static void main(String[] args) {
			
		List<Trader> trade =Arrays.asList(
					new Trader("Ram", "Delhi"),
					new Trader("Rahul", "UP"), 
					new Trader("Ritu", "Pune"),
					new Trader("Shyam", "Indore"),
					new Trader("Sam", "Pune"),
					new Trader("Hera", "Indore"),
					new Trader("Gaurav", "Delhi"), 
					new Trader("Deep", "Pune"), 
					new Trader("Shri", "Indore")
					);
			
		long count = trade.stream()
		.filter(t->(t.getCity().equals("Indore")))
		.count();
		
		System.out.println(count+ " Traders are Indore based.");
	}

}