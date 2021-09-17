import java.util.Scanner;

public class DesertShop 
{
	public static void main(String[] args) 
	{
		 Scanner sc = new Scanner(System.in);
		 
         System.out.println("Who are you?\nOwner OR Customer:");
         String user = sc.nextLine();
         
         if(user.equals("owner"))
         {
        	 System.out.println("Welcome Back Owner");
        	 System.out.println("Enter the amount of \nCandy\nIcecream\nCookie\nto add in storage :");
        	 Owner own = new Owner(sc.nextInt(), sc.nextInt(), sc.nextInt(), user);
        	 System.out.println(own.candyCount(own.candyCount));
        	 System.out.println(own.icreamCount(own.iceCreamCount));
        	 System.out.println(own.cookieCount(own.cookieCount));
         }
         else
         {
             System.out.println("Welcome to our DESERT SHOP!");
             System.out.println("Enter amount of\nCandy\nIcecream\nCookie\nto purchase :");
             Customer customer = new Customer(sc.nextInt(),sc.nextInt(),sc.nextInt(), user);
             System.out.println(customer.getBill(customer.iceCreamCount, customer.candyCount, customer.cookieCount));
             //System.out.println(customer.candyCount(1));
             System.out.println("Please Visit Us Again "+user);
         }		

	}

}


abstract class DessertItem
{
    public int iceCreamCount;
    public int candyCount;
    public int cookieCount;
    public String user;

    public DessertItem(int iceCreamCount,int candyCount,int cookieCount,String user)
    {
        this.iceCreamCount=iceCreamCount;
        this.candyCount=candyCount;
        this.cookieCount=cookieCount;
        this.user=user;

    }
    
    public String icreamCount(int iceCream)
    {
       if(user.equals("owner"))
    	{
            iceCreamCount = iceCream;
            return "Updated IcreCream Storage";
    	}
    	 else
    	 {
    	    return "Access Denied";
    	    
    	 }
    }
    
    public String candyCount(int candy)
    {
    	if(user.equals("owner"))
    	{
    		candyCount = candy;
    		return "Updated Candy Storage";
    	}
    	else
    	{
    		return "Access Denied";
    	}
    }
    
    public String cookieCount(int cookie)
    {
    	if(user.equals("owner"))
    	{
          cookieCount = cookie;
          return "Updated Cookie Storage"; 
    	}
    	else
    	{
    		return "Access Denied";
    	}
    }
}

class Owner extends DessertItem
{

    public Owner(int iceCreamCount, int candyCount, int cookieCount, String user) 
    {
        super(iceCreamCount, candyCount, cookieCount, user);

    }

}

class Customer extends DessertItem
{
    public Customer(int iceCreamCount, int candyCount, int cookieCount, String user) 
    {
        super(iceCreamCount, candyCount, cookieCount, user);  
    }
    public int getBill(int iceCreamCount, int candyCount, int cookieCount)
    {
        System.out.print("Your Order :\n"+iceCreamCount+" Ice Creame\n"+candyCount+" Candie\n"+cookieCount+" Cookie\nAmount: ");
        return iceCreamCount*50+candyCount*60+cookieCount*70;
    }
}


