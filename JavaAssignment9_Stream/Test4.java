package capg.co;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test4 {

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
		
		Map<Integer,List<News>> newsMap = news.stream()
			        .collect(Collectors.groupingBy(News::getNewsId));

			        int id = 0, max_com = 0;
			        for(Integer i:newsMap.keySet())
			        {
			            if(newsMap.get(i).size()>max_com)
			            {
			                max_com = newsMap.get(i).size();
			                id = i;
			            }
			        }
			        System.out.println("NewsId : "+id+" has maximum comments.");

	}

}