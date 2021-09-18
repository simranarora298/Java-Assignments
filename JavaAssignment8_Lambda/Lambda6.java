package capg.co;

import java.util.ArrayList;
import java.util.List;

public class Lambda6 {

	public static void main(String[] args) {
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
		
		arrList.replaceAll(sweet->sweet.toUpperCase());

		System.out.println("After replacing every element with its upper case equivalent");
		for(String sweet:arrList)
			System.out.println(sweet);

	}

}
