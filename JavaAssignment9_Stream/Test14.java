package capg.co;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Test14 {

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
		
		Optional<Transaction> t = trans.stream()
		        .max(Comparator.comparing(Transaction::getValue));
		        System.out.println(t);

	}

}
