package abstractandintrefacepack;


abstract class BankAccount
{
 protected String accountnum; 
 protected double balance;   

 abstract void deposit(double amount);
 abstract void withdraw(double amount);
}

class CheckingAccount extends BankAccount
{ 
 public CheckingAccount(String accountnum, double balance) 
 {
     this.accountnum = accountnum;
     this.balance = balance;
 }

 @Override
 void deposit(double amount) 
 {
     this.balance += amount;
     System.out.println("Account details after deposit:");
     System.out.println("Account number: " + accountnum + "\nAmount deposited: " + balance);
 }

 @Override
 void withdraw(double amount) 
 {
     if (this.balance >= amount) 
     {
         this.balance -= amount;
         System.out.println("\nAccount details after withdrawal:");
         System.out.println("Account number: " + accountnum + "\nAmount withdrawn: " + balance);
     } else {
         System.out.println("Insufficient balance");
     }
 }   
}

public class BankAccountAbstractDemo 
{
 public static void main(String[] args) 
 {
     
     CheckingAccount ca = new CheckingAccount("788654A56", 2000);
     
     ca.deposit(2000);
     ca.withdraw(500);
 }
}