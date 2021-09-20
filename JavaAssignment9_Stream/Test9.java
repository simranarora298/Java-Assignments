package capg.co;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test9 {

	public static void main(String[] args) {
		
		List<Trader> trade =Arrays.asList(
				new Trader("Ram", "Delhi"),
				new Trader("Rahul", "UP"), 
				new Trader("Ritu", "Dehradun"),
				new Trader("Shyam", "Lukhnow"),
				new Trader("Sam", "UP"),
				new Trader("Hera", "Gujrat"),
				new Trader("Gaurav", "Delhi"), 
				new Trader("Deep", "Dehradun"), 
				new Trader("Shri", "Delhi")
				);
		
		Map<String,List<Trader>> tradeMap = trade.stream()
				.collect(Collectors.groupingBy(Trader::getCity));
		
		for(String t : tradeMap.keySet())
		{
			System.out.println(t);
		}
	}

}
