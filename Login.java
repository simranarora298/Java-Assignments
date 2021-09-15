import java.util.Scanner;

public class Login {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int count =2;
		System.out.println("Enter user Id:");
		String user_id = sc.next();
		String pass = "";
	loop:
	while(true)
	{
		if(user_id.equals("User"))
		{
			while(count>=0)
			{
				System.out.println("Enter password:");
				pass = sc.next();
				if(pass.equals("capg"))
				{
					System.out.println("Welcome " + user_id);
					break loop;
				}
				else
				{
					System.out.println("Wrong Password.\n"+count+" Attempts Remaining");
					count--;
				}
			}
			System.out.println("Contact Admin");
			break;
		}
		else
		{
			System.out.println("Wrong User Id.");
			break;
		}
	}
	}

}

