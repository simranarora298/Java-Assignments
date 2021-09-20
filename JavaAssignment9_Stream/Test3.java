package capg.co;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Test3 {

	public static void main(String[] args) 
	{
		List<Fruit> fruits = Arrays.asList(
				new Fruit("Kiwi",30, 40, "Green"),
				new Fruit("Cherry", 12, 200, "Red"),
				new Fruit("Orange", 25, 58, "Orange"),
				new Fruit("Banana",45,50,"Yellow"),
				new Fruit("Apple", 67, 120, "Red"),
				new Fruit("Chiku", 179, 230, "Brown"),
				new Fruit("Strawberry",76,154,"Red")
				);
		
		fruits.stream()
		.filter(f->(f.getColor().equals("Red")))  				//Filter fruit with color = Red
		.sorted(Comparator.comparing(Fruit::getPrice)) 			//Sort the fruit list in ascending order of price
		.forEach(System.out::println);							//Print the list of fruit
		
	}

}
