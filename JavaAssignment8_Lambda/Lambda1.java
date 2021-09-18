package capg.co;

import java.util.Scanner;

@FunctionalInterface
interface Calculate
{
	public int calculate(int x,int y);
}

public class Lambda1 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two no:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		Calculate add=(x,y)->x+y;
		Calculate sub=(x,y)->x-y;
		Calculate mul=(x,y)->x*y;
		Calculate div=(x,y)->x/y;
		
		System.out.println("Addition : "+add.calculate(a,b));
		System.out.println("Subtraction : "+sub.calculate(a,b));
		System.out.println("Multiplication : "+mul.calculate(a,b));
		System.out.println("Division : "+div.calculate(a,b));


	}

}

