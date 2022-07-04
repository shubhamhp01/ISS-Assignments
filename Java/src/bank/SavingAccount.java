package bank;

public class SavingAccount {
private double balance;
private double lastTransaction;
private String custName;
static int numberOfAccounts;
private final String defaultName="NoNameAssigned";
public SavingAccount()
{
custName=defaultName;
numberOfAccounts++;
}
public SavingAccount(String name)
{
custName=name;
numberOfAccounts++;
}
public String getCustName() {
return custName;
}
public void setCustName(String custName) {
this.custName = custName;
}
public void deposit(int amount)
{
if(amount>=0) {
balance+=amount;
lastTransaction=amount;
}
else
System.out.println("Enter valid amount");
}
public void withdraw(int amount)
{
if(amount>=0) {
balance-=amount;
lastTransaction=-amount;
}
else
System.out.println("Enter valid amount");
}
public void statement()
{
System.out.println("Name: "+custName+"\n"+"Balance: "+balance+"\n"+"LastTransaction: "+lastTransaction+"\n");
}

}