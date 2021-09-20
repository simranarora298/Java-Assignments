package capg.co;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;


public class Test2 
{

	public static void main(String[] args) 
	{
		
		List<Fruit> fruit=Arrays.asList(
				new Fruit("Cherry",63,40,"Red"),
				new Fruit("Musk Melon",12,50,"Yellow"),
				new Fruit("Apple",52,120,"Red"),
				new Fruit("Mango",60,60,"Yellow"),
				new Fruit("Strawberry",33,150,"Red"),
				new Fruit("Banana",102,50,"Yellow"),
				new Fruit("Pumpkin",26,70,"Orange"),
				new Fruit("Pineapple",110,70,"Green"));
		
		 Map<String, Set<String>> result =
	                fruit.stream()
	                .collect(Collectors.groupingBy(Fruit::getColor,Collectors.mapping(Fruit::getName, Collectors.toSet())));
		 
	    System.out.println(result);
	}
}
		