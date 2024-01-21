import java.util.*;
public class BinoCoeff
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

  public static int BinoCoeff(int n,int r)
 {
  int factn=factorial(n);
  int factr=factorial(r);
  int factsub=factorial(n-r);
  int BinoCoeff=factn/(factr*factsub);
  return BinoCoeff;
 }

 public static void main(String[] args)
 {
  Scanner scan=new Scanner(System.in);
  System.out.print("Give n: ");
  int n= scan.nextInt();

  System.out.print("Give r: ");
  int r= scan.nextInt();

  int result=BinoCoeff(n,r);
  System.out.println("Binomial Coefficient ="+result);
 }
}
