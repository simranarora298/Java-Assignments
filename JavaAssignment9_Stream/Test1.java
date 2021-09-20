package capg.co;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Test1 {

	public static void main(String[] args) 
	{
		List<Fruit> fruits = Arrays.asList(
				new Fruit("Kiwi",30, 40, "Green"),
				new Fruit("Orange", 25, 58, "Orange"),
				new Fruit("Banana",45,50,"Yellow"),
				new Fruit("Apple", 67, 120, "Red"),
				new Fruit("Chiku", 179, 230, "Brown")
				);
		fruits.stream()
		.filter(f->(f.getCalories()<100))  							 //Filter fruit with calories<100
		.sorted(Comparator.comparing(Fruit::getCalories).reversed()) //Sort the fruit list in descending order of calories
		.forEach(System.out::println);								 //Print the list of fruit
		
	}

}
