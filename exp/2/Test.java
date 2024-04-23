class SavingsAccount
{
 static float AnnualInterest;
 private float SavingsBalance;
 public void CalculateMonthlyInterest()
 {
   float MonthlyInterest=SavingsBalance*(AnnualInterest/12);
   float temp=this.SavingsBalance;
   temp=MonthlyInterest+SavingsBalance;
   System.out.println("Balance after addding monthly interest: "+temp);
 }
 public static void ModifyInterestRate(float interest)
{
 AnnualInterest=interest;
}
public SavingsAccount(int balance)
{
 this.SavingsBalance=balance;
System.out.println("Your balance is: "+SavingsBalance);
}
}

public class Test
{
 public static void main(String[] args)
{
 SavingsAccount saver1=new SavingsAccount(2000);
 SavingsAccount saver2=new SavingsAccount(3000);
 SavingsAccount.ModifyInterestRate(4.00f);
 saver1.CalculateMonthlyInterest();
 saver2.CalculateMonthlyInterest();

 SavingsAccount.ModifyInterestRate(5.00f);
 saver1.CalculateMonthlyInterest();

 saver2.CalculateMonthlyInterest();
}
}