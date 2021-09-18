package capg.co;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class Lambda7 
{
	public static void main(String[] args) 
	{
		Map<Integer,String> map=new HashMap<>();

		map.put(1, "Icecream");
		map.put(2, "Candy");
		map.put(3, "Cookie");
		map.put(4, "Donuts");
		map.put(5, "Brownie");
		map.put(6, "Cake");
		map.put(7, "Pancake");
		map.put(8, "Waffle");
		map.put(9, "Chocolate");
		
		StringBuilder fstr=new StringBuilder();
		
		Consumer<Map.Entry<Integer,String>> cons= sweet->fstr.append(sweet.getKey()+sweet.getValue());
		
		for(Map.Entry<Integer,String> sweet:map.entrySet())
			cons.accept(sweet);
		
		System.out.println("Final string :"+fstr);
	}

}