import java.util.*;
public class factorial
{
  public static int factorial(int n)
 {
   int fact=1;
   for(int i=1;i<=n;i++)
   {
    fact=fact*i;
   } 
  return fact;
 }

 public static void main(String[] args)
 {
  Scanner scan=new Scanner(System.in);
  System.out.print("Give a number to find its factorial: ");
  int n= scan.nextInt();
  int fact=factorial(n);
  System.out.println(n+"!"+"="+fact);
 }
}
