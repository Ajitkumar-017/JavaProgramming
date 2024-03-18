package Math;
import java.util.Scanner;
public class mean
{
 
 public void mean(int n)
 {
 Scanner scan=new Scanner(System.in);
  int sum=0;
  System.out.println("Enter the size of array: ");
  int [] arr=new int[n];
  for(int i=0;i<=n;i++)
  {
       int elem=scan.nextInt();
	  arr[i]=elem;
 }
  for(int i=0;i<=n;i++)
  {
	sum= arr[i]+arr[i+1];
 }
 int result=sum/n;
 System.out.println("Mean: "+result);
}
}