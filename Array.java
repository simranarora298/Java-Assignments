
	import java.util.Scanner;

	public class Array 
	{

		public static void main(String[] args) 
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter value to be searched:");
			int value = sc.nextInt();
			int arr[]= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
			for(int i:arr)
			{
				if(arr[i]==value)
				{
					System.out.println("Number found at index "+i);
					break;
				}
			}

		}

	}

