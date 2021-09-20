package capg.co;

import java.util.Arrays;
import java.util.List;

public class Test13 {

	public static void main(String[] args) {
		
		List<Transaction> trans =Arrays.asList(
				new Transaction(new Trader("Ram", "Delhi"), 2011, 15000),
				new Transaction(new Trader("Rahul", "UP"), 2020, 25000),
				new Transaction(new Trader("Ritu", "Dehradun"), 2012, 18769),
				new Transaction(new Trader("Shyam", "Lukhnow"), 2006, 23050),
				new Transaction(new Trader("Sam", "UP"), 2016, 15040),
				new Transaction(new Trader("Hera", "Gujrat"), 2011, 10000),
				new Transaction(new Trader("Gaurav", "Delhi"), 2014, 11900),
				new Transaction(new Trader("Deep", "Dehradun"), 2001, 100000),
				new Transaction(new Trader("Shri", "Delhi"), 1990, 250000)
				);
		
		trans.stream()
        .filter(t -> (t.getTraderCity().equals("Delhi")))      
        .forEach(t->System.out.println(t.getTrader().getName()+"\t"+t.getValue()));
	}

}
