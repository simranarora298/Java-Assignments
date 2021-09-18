package capg.co;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
public class Lambda5 
{
	public static void main(String[] args) 
	{
		List<String> arrList = new ArrayList<>();
		arrList.add("Chocolates");
		arrList.add("Icecreams");
		arrList.add("Candies");
		arrList.add("Cookies");
		arrList.add("Donuts");
		arrList.add("Brownies");
		arrList.add("Cakes");
		arrList.add("Pancakes");
		arrList.add("Waffles");
					
		StringBuilder fstr=new StringBuilder();
		
		Consumer<String> cons = sweet->fstr.append(sweet.charAt(0));
		
		for(String sweet:arrList)
			cons.accept(sweet);
			
		System.out.println("Final String : "+fstr);		
	}

}
