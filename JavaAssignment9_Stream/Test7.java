package capg.co;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test7 {

	public static void main(String[] args) {

		List<News> news=Arrays.asList(
				new News(1, "Ram", "Shyam","Budget has increased so much." ),
				new News(2, "Hira", "Shyam", "Home loan increased."),
				new News(1, "Ram", "Rahul", "New budget was announced today."),
				new News(4,"Sidhi","Ritu","The hype of budgets."),		
				new News(1, "Ram", "Shyam","Budget has increased so much." ),
				new News(2, "Hira", "Shyam", "Home loan increased."),
				new News(1, "Ram", "Rahul", "New budget was announced today."),
				new News(4,"Sidhi","Ritu","The hype of budgets."),	
				new News(1, "Ram", "Shyam","Budget has increased so much." ),
				new News(2, "Hira", "Shyam", "Home loan increased."),
				new News(1, "Ram", "Rahul", "New budget was announced today."),
				new News(4,"Sidhi","Ritu","The hype of budgets.")			
				);
			
		
		Map<String,List<News>> newsMap = news.stream()
		        .collect(Collectors.groupingBy(News::getCommentByUser));
		        
		        for(String s:newsMap.keySet())
		        {
		            System.out.println(s+" has commented on "+newsMap.get(s).size()+" posts");
		        }

	}

}
