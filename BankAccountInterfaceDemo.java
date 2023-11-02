package abstractandintrefacepack;

interface BankAccount 
{
    void deposit(double amount);
    void withdraw(double amount);
}

class CheckingAccount implements BankAccount
{
    private String accountnum; 
    private double balance;   
    
    public CheckingAccount(String accountnum, double balance) 
    {
        this.accountnum = accountnum;
        this.balance = balance;
    }

    @Override
    public void deposit(double amount) 
    {
        this.balance += amount;
        System.out.println("Account details after deposit:");
        System.out.println("Account number: " + accountnum + "\nAmount deposited: " + balance);
    }

    @Override
    public void withdraw(double amount) 
    {
        if (this.balance >= amount) 
        {
            this.balance -= amount;
            System.out.println("\nAccount details after withdrawal:");
            System.out.println("Account number: " + accountnum + "\nAmount withdrawn: " + balance);
        } else 
            System.out.println("Insufficient balance");
    }
}

public class BankAccountInterfaceDemo 
{
    public static void main(String[] args) 
    {
        
        CheckingAccount ca = new CheckingAccount("008833R50", 4000);
        ca.deposit(1500);
        ca.withdraw(1000);
    }
}