//MAIN CLASS
package bank;

public class Customer {
public static void main(String args[])
{
SavingAccount account1=new SavingAccount();
account1.deposit(30);							//Transactions
account1.statement();
account1.withdraw(20);
account1.statement();
SavingAccount account2=new SavingAccount("Shubham");
account2.deposit(300);
account2.statement();
account2.withdraw(20);
account2.statement();
System.out.println("Number of Accounts are: "+SavingAccount.numberOfAccounts);  //Total no of accounts present..Depends on no of objects created.
}
}
