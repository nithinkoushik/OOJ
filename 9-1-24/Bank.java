import java.util.Scanner;
class Account
{
String CustomerName;
double AccNo,Balance;
Account(String CustomerName,double AccNo,double Balance)
{
this.CustomerName=CustomerName;
this.AccNo=AccNo;

this.Balance=Balance;
}
public void Deposit(double Amount)
{
Balance+=Amount;
System.out.println("DEPOSIT SUCCESSFUL");
DisplayBalance();
}
void DisplayBalance()
{
System.out.println("BALANCE:"+Balance);
}
}
class CurrentAccount extends Account
{
double MinBalance=500.0;
double Charges=10.0;
CurrentAccount(String CustomerName,double AccNo,double Balance)
{
super(CustomerName,AccNo,Balance);
}
void Withdraw(double Amount)
{
if(Balance>=Amount)
{
Balance-=Amount;
System.out.println(Amount+"withdrawn successfully");
DisplayBalance();
}
else
{
System.out.println("insufficient Balance");
}
}
void UpdateBalance()
{
if(Balance<=MinBalance)
{
Balance-=Charges;
System.out.println("service charge applied for maintaining low balance");
DisplayBalance();
}
}
}
class SavingsAccount extends Account
{
SavingsAccount(String CustomerName,double AccNo,double Balance)
{
super(CustomerName,AccNo,Balance);
}
double interest=0.05;
void UpdateBalance()
{
Balance=Balance+(interest*Balance);
DisplayBalance();
}
void Withdraw(double Amount)
{
if(Balance>=Amount)
{
Balance-=Amount;
DisplayBalance();
}
else
{
System.out.println("insufficient Balance");
}
}}
class Bank
{
public static void main(String args[])
{
String CustomerName;
double AccNo,Balance;double amt,amt1;
Scanner in=new Scanner(System.in);
System.out.println("enter name:");
CustomerName=in.next();

System.out.println("enter AccNo:");
AccNo=in.nextDouble();
System.out.println("enter Balance:");
Balance=in.nextDouble();
System.out.println("enter amount to deposit");
amt=in.nextDouble();
System.out.println("enter amount to withdraw");
amt1=in.nextDouble();
CurrentAccount c=new CurrentAccount(CustomerName,AccNo,Balance);
c.Deposit(amt);
c.Withdraw(amt1);
c.UpdateBalance();
System.out.println(" ");
SavingsAccount s=new SavingsAccount(CustomerName,AccNo,Balance);
s.Deposit(amt);
s.Withdraw(amt1);
s.UpdateBalance();
}
}

