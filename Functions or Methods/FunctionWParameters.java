public class FunctionWParameters
{
  public static int SumOfAB(int a,int b) //parameters are nothing but inputs to functions  //a and b are formal parameters
  {
   return a+b;				//return is compulsory if return type of fuction is not void
  }
  public static void main(String[] args)
  { 
   int sum= SumOfAB(5,3);               //Passing Parameters 5 and 3                   //5 and 3 are actual parameters 
   System.out.println(sum);		        	     
  }
}