package capg.co;

import java.util.Arrays;
import java.util.List;

public class Test5 {

	public static void main(String[] args) 
	{
		List<News> news = Arrays.asList(
				new News(1, "Ram", "Shyam","Budget has increased so much." ),
				new News(2, "Hira", "Shyam", "Home loan increased."),
				new News(3, "Ram", "Rahul", "New budget was announced today."),
				new News(4,"Sidhi","Ritu","The hype of budgets.")
				);
		
		long count = news.stream()
		.filter(c->c.getComment().toLowerCase().contains("budget"))
		.count();
		
		System.out.println("Budget was repeated "+count+" times.");

	}

}
