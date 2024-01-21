import java.util.*;
public class primeNo
{
  public static void prime(int n)
  {
    int flag=0;
    for(int i=2;i<=Math.sqrt(n);i++)
    {
     if(n%i==0)
     {
      flag=1;
      System.out.println(n +" is not a prime number");
      break;
     }
    }
    if(flag==0)
    System.out.println(n +" is a prime number");
  
  }
  public static void main(String[] args)
  {
   Scanner scan=new Scanner(System.in);
   System.out.print("Give a Number to check if it is prime or not: ");
   int n=scan.nextInt();
   prime(n);
  }
}