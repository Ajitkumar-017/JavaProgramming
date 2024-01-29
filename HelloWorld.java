//First Program demonstrating runtime arguments
public class HelloWorld
{
  public static void main(String args[])
  {
    System.out.println("Hello World!");
    if(args.length>0 && args[0].equals("g"))
    System.out.println("Good Morning!");
    else if(args.length>0 && args[0].equals("a"))
    System.out.println("Good Afternoon!");
    else if(args.length>0 && args[0].equals("e"))
    System.out.println("Good Evening!");
    else if(args.length>0 && args[0].equals("n"))
    System.out.println("Good Night!");
    if(args.length>0 && args[0].equals("h"))
    System.out.println("Hiiii!!!!");
    if(args.length>0 && args[0].equals("i"))
    {
      while(true)
      {
       System.out.print("Infinite loop ");
      }
    }
   if(args.length>0 && args[0].equals("r"))
    System.out.print("Recursion\nHello World");
   if(args.length>0 && args[0].equals("s"))
   {
    System.out.println("Printing * pattern......");
    for(int i=1;i<=4;i++)
    {
     for(int j=1;j<=i;j++)
     {
      System.out.print("*");
     }
    System.out.println();
    }
   }
  
  }

}