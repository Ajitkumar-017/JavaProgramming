import java.util.*;
public class DecToBinary
{
  public static void DecToBinary(int n)
  { 
    int binary=0;
    int multiplier=1;
    while(n>0)
    {
     int reminder=n%2;
     binary=binary+reminder*multiplier;
     multiplier*=10;
     n=n/2;
    }
    System.out.print(binary);
  }
  public static void main(String[] args)
  {
   Scanner scan=new Scanner(System.in);
   System.out.print("Enter a Decimal number to convert to Binary: ");
   int n=scan.nextInt();
   DecToBinary(n);
  }
}