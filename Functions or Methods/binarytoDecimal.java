import java.util.*;
public class binarytoDecimal
{
 public static void conversion(int n)
 {
  int decimal=0,pow=0;
  while(n>0)
 {
  int lastdigit=n%10;
  decimal=decimal+(lastdigit*(int)Math.pow(2,pow));
  pow++;
  n=n/10;
  }
  System.out.print("decimal = "+decimal);
 }
 public static void main(String[] args)
 {
  System.out.print("Give a Binary Number: ");
  Scanner scan=new Scanner(System.in);
  int n= scan.nextInt();
  conversion(n);
 }
}