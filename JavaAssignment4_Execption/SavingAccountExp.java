public class SavingAccountExp 
{
    public static void main(String[] args) throws InsufficientBalanceException, IllegalBankTransactionException 
    {
        SavingAccount s = new SavingAccount(234,4000);
        System.out.println(s.deposit(600));
        System.out.println(s.withdraw(4500));
        try
        {
            System.out.println(s.withdraw(150));
        } 
        catch(IllegalBankTransactionException e)
        {
            e.printStackTrace();
        }
    }
}

class SavingAccount
{
    private int id;
    private double balance;

    public SavingAccount(int id, int balance) 
    {
        this.id = id;
        this.balance = balance;
    }

    double withdraw(double amount) throws  InsufficientBalanceException , IllegalBankTransactionException
    {
        if(amount > 0)
        {
            if(balance < amount)
            {
                throw new InsufficientBalanceException(this.id +" has insufficient balance");
            }
            else 
            {
                this.balance -= amount;
                return this.balance;
            }
        }
        else 
        {
            throw new IllegalBankTransactionException();
        }
    }
    double deposit(double amount)
    {
        this.balance += amount;
        return this.balance;
    }
}

class InsufficientBalanceException extends Exception 
{
    InsufficientBalanceException(){}
    InsufficientBalanceException(String msg)
    {
        super(msg);
    }
}
class IllegalBankTransactionException extends Exception
{
    public IllegalBankTransactionException() {}
    public IllegalBankTransactionException(String message) 
    {
        super(message);
    }
}

