package capg.co;

import java.util.*;
public class Lambda4 
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
			
			arrList.removeIf(sweets->sweets.length()%2!=0);

			System.out.println("After removing words having Odd lengths:");
			for(String sweet:arrList)
				System.out.println(sweet);
	}
}