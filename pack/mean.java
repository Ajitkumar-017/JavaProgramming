package math;
import java.util.Scanner;
import java.lang.Math;
public class Statistics
{
 public void mean(int n)
 {
 Scanner scan=new Scanner(System.in);
  int sum=0;
  System.out.println("Enter the array elements: ");
  int [] arr=new int[n];
  for(int i=0;i<n;i++)
  {
       int elem=scan.nextInt();
	    arr[i]=elem;
	    arr[i]=elem;
 }
  for(int i=0;i<n;i++)
  {
	sum+= arr[i];
 }
 int result=sum/n;
 System.out.println("Mean: "+result);
}

public void median(int n)
 {
  Scanner scan=new Scanner(System.in);
  int median=0;
 
  System.out.println("Enter the arry elements: ");
  int [] arr=new int[n];
  for(int i=0;i<n;i++)
  {
       int elem=scan.nextInt();
	    arr[i]=elem;
	    arr[i]=elem;
		
 }
  if(n%2!=0)
   {
	   median=n/2;
	   median=+1;
	   median=arr[median];
       System.out.println("Median: "+median);   
	   
   }
   
   else if(n%2!=0)
   {
   median=((n/2)+((n/2)+1))/2;
   median+=1;
   median=arr[median];
   System.out.println("Median: "+median);
}


public void avg(int n)
 {
 Scanner scan=new Scanner(System.in);
  int sum=0;
  System.out.println("Enter the array elements: ");
  int [] arr=new int[n];
  for(int i=0;i<n;i++)
  {
       int elem=scan.nextInt();
	    arr[i]=elem;
	    arr[i]=elem;
 }
  for(int i=0;i<n;i++)
  {
	sum+= arr[i];
 }
 int result=sum/n;
 System.out.println("Average: "+result);
}


public void stddev(int n)
 {
 Scanner scan=new Scanner(System.in);
  int sum=0;
  int variance=0;
  System.out.println("Enter the array elements: ");
  int [] arr=new int[n];
  for(int i=0;i<n;i++)
  {
       int elem=scan.nextInt();
	    arr[i]=elem;
	    arr[i]=elem;
 }
  for(int i=0;i<n;i++)
  {
	sum+= arr[i];
 }
 int mean=sum/n;
  for(int i=0;i<n;i++)
  {
       int elem=scan.nextInt();
	    variance=((arr[i]-mean)*(arr[i]-mean))/n;
	
 }
 int result=Math.sqrt(variance);
 System.out.println("Standard deviation: "+result);
}
}