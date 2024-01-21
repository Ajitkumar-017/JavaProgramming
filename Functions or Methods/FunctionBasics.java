public class FunctionBasics
{
  public static void PrintHelloWorld()  //public static is accesibility modifier and function return void (nothing) and has name PrintHelloWorld
  {
   System.out.println("Hello World");
   return;				//return is not compulsory if return type of function is void
  }
  public static void main(String[] args)
  {
    PrintHelloWorld();            	//function Call
  }
}