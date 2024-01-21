//Function overloading in java
public class funOverloading
{
 public static int sum(int a,int b)
 {
 return a+b;
 }
 public static double sum(int x,int y)
 {
 return x+y;
 }
 public static void main(String[] args)
 {
  int a=5,b=2;
  int x=6, y=2;
  int iSum=sum(a,b);
  double fSum=sum(x,y);
  System.out.println(iSum);
  System.out.println(fSum);
 }
}

//In java function overloading only depends on the no of parameters or type of parameters
//not on the return type of the function
//while compiling above program you will get error sum() already defined 