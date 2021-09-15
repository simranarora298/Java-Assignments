import java.util.Scanner;

public class UnsupportedExp 
{
	public static void main(String[] args) 
	{	
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter no:");
			int a = sc.nextInt();
			int b = sc.nextInt();
			try
			{
				if(b==0)
				throw new UnsupportedOperationException();
				System.out.println("Result:"+a/b);
			}
			catch(ArithmeticException e)
			{
				System.out.println("Error: "+e);
			}
			catch(UnsupportedOperationException e)
			{
				System.out.println("Error: "+e);
			}
	}}

