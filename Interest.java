import java.util.Scanner;

public class Interest {

		public static void main(String[] args) 
		{
			Scanner sc = new Scanner(System.in);
			double princ, rate, time, si , ci ,cf;
			System.out.println("Enter Principal Amount, Rate and Time(in years):");
			princ = sc.nextDouble();
			rate = sc.nextDouble();
			time = sc.nextDouble();
			System.out.println("Enter the value of Compounding frequency:");
			cf = sc.nextDouble();
			si = (princ* rate * time)/100;
			ci = princ*(Math.pow((1+ rate/100),(cf*time)))-princ;
			System.out.println("Simple Interest: "+ si);
			System.out.println("Compound Interest: "+ ci);
			
		}

}

