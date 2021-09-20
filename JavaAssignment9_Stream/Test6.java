package capg.co;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test6 {

	public static void main(String[] args) {

		List<News> news =Arrays.asList(
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

		int max_com = 0; 
		String user = "";
		for(String s:newsMap.keySet())
		{
			if(newsMap.get(s).size()>max_com)
			{
				max_com = newsMap.get(s).size();
				user = s;
			}
		}
		System.out.println(user+" have posted maximum comments");

	}
}