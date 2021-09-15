package capg.co;
import java.util.Scanner;
public class ArithmeticExp {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter two nos:");
			int a = sc.nextInt();
			int b = sc.nextInt();
			try
			{
				System.out.println("Result:"+ a/b);
			}
			catch (ArithmeticException e) {
				System.out.println("Number cannot be divided by zero.");
			}
		}
}
