package capg.co;
import java.util.Scanner;

@FunctionalInterface
interface myLambda{
	double perform(double x,double y,double z);
}

public class Java11_1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter values of Principal,Rate and Time(in years)");
		double princ=sc.nextDouble();
		double rate=sc.nextDouble();
		double time=sc.nextDouble();
		
		myLambda si=(x,y,z)->(x*y*z)/100;
		
		System.out.println("Simple interest : "+si.perform(princ, rate, time));	
	}
}
