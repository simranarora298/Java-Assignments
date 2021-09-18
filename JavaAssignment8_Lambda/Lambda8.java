package capg.co;

import java.util.*;

public class Lambda8 
{
	public static void main(String[] args) 
	{
		List<Integer> arrList=new ArrayList<>();
		arrList.add(120);
		arrList.add(45);
		arrList.add(78);
		arrList.add(92);
		arrList.add(109);
		arrList.add(432);
		arrList.add(234);
		
		Thread lambdaThread= new Thread(()->arrList.forEach(num->System.out.println("Number: "+num)));
		lambdaThread.run();	
	}
}
