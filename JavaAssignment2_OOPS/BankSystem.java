
public class BankSystem {

	public static void main(String[] args) 
	{
		 Bank sb = new Savings(1,"Ram",1500,100);
	     System.out.println("Total cash in "+sb.name+" Savings Account is $"+sb.totalCash());

	     Bank cr = new Current(2,"Ravi",2000,90);
	     System.out.println("Total cash in "+cr.name+" Current Account is $"+cr.totalCash());

	}

}

class Bank{
    int accountNo;
    String name;
    int mainBalance;
  
   public Bank(int accountNo,String name,int mainBalance){
       this.accountNo=accountNo;
       this.name=name;
       this.mainBalance=mainBalance;
   }
   public int totalCash(){
       return mainBalance;
   }
}

class Savings extends Bank{
   private int fd;
  
   public Savings(int accountNo,String name,int mainBalance,int fd){
       super(accountNo,name,mainBalance);
       this.fd=fd;
   }
   public int totalCash()
   {
       return fd+mainBalance;
   }

}

class Current extends Bank{
	private int cc;
  
	public Current(int accountNo,String name,int mainBalance,int cc){
       super(accountNo,name,mainBalance);
       this.cc=cc;
   }
   public int totalCash(){
       return cc+mainBalance;
   }
}



