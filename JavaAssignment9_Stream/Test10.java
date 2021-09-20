package capg.co;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Test10 {

	public static void main(String[] args) {
		
		List<Trader> trade =Arrays.asList(
				new Trader("Ram", "Delhi"),
				new Trader("Rahul", "UP"), 
				new Trader("Ritu", "Pune"),
				new Trader("Shyam", "Lukhnow"),
				new Trader("Sam", "Pune"),
				new Trader("Hera", "Pune"),
				new Trader("Gaurav", "Delhi"), 
				new Trader("Deep", "Pune"), 
				new Trader("Shri", "Delhi")
				);
		
		trade.stream()
		.sorted(Comparator.comparing(Trader::getName))
		.forEach(System.out::println);
	}

}
