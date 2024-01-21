import java.util.Scanner;

public class AllPatterns
{
  public static void main(String[] args)
  {
   System.out.print("==============Pattern Printing Program Collection============\n");
    Scanner scan=new Scanner(System.in);
    while(true)
    {
      System.out.print("\n1.Right Angle Triangle\n2.Inverted Star pattern\n3.Half Pyramid\n4.Character Pattern\n5.Inverted Mirror Pyramid\n6.Number Pattern\n7.Floyds Triangle\n8.Zero One Triangle\n9.Butterfly patten\n10.Exit\n");
      System.out.print("Enter your choice: ");
      int choice=scan.nextInt();
      switch(choice)
      {
       case 1:
       
        //Right Angle Triangle
         for(int i=1;i<=3;i++)
         {
           for(int j=1;j<=i;j++)
            {
             System.out.print("*");
            }
        System.out.println();
          }
       break;

       case 2:
       
        //Inverted Star Pattern
         for(int i=1;i<=3;i++)
         {
           for(int j=1;j<=3-i+1;j++)
           {
            System.out.print("*");
           }
        System.out.println();
         }
       break;

       case 3:   
        //Half Pyramid Pattern
        
         for(int i=1;i<=4;i++)
         {
           for(int j=1;j<=i;j++)
          {
           System.out.print(j);
          }
        System.out.println();
        }
       
       break;

      case 4:
       //Character Pyramid
        char ch='A';
        for(int i=1;i<=4;i++)
        {
          for(int j=1;j<=i;j++)
          {
           System.out.print(ch);
           ch++;
          }
        System.out.println();
        }
       
       break;

       case 5:
         //Inverted Mirror Pattern
         for(int i=1;i<=4;i++)
         {
           for(int j=1;j<=4-i;j++)
           {
            System.out.print(" ");
           }
           for(int j=1;j<=i;j++)
           {
            System.out.print("*");
           }
         System.out.println();
         }
       
        break;
  

       case 6:
         //Number Pattern
         for(int i=1;i<=4;i++)
         {
           for(int j=1;j<=6-i;j++)  
           {
            System.out.print(j);
           }
         System.out.println();
          }
        
        break;
 
       case 7:
         //FLoyd's Triangle
         int no=1;
         for(int i=1;i<=4;i++)
         {
           for(int j=1;j<=i;j++)
           {
            System.out.print(no+" ");
	    no++;                     //update the value of no to print 2 after 1 and also to not start next row by 1 again
           }
         System.out.println();
         }
       
       break;

      case 8:
        //Zero one Triangle
        for(int i=1;i<=5;i++)
        {
          for(int j=1;j<=i;j++)
          {
            if((i+j)%2!=0)         //In matrix if i+j is odd i.e [1,2],[2,3],[4,1],...etc
              System.out.print(0); //Print 0 to that location
            else                   //else if i+j is even i.e [1,1],[4,2],[3,1],....etcc
	      System.out.print(1); //then print 1 to that location in that matrix 
           }
        System.out.println();
         }
       
      break;

       case 9:
         //Butterfly Pattern
         for(int i=1;i<=4;i++)
        {
          for(int j=1;j<=i;j++)
          {
           System.out.print("*");
           }

          for(int j=1;j<=2*(4-i);j++)
         {
          System.out.print(" ");
         }

         for(int j=1;j<=i;j++)
         {
          System.out.print("*");
         }
        System.out.println();
        }

         for(int i=4;i>=1;i--)
         {
           for(int j=1;j<=i;j++)
           {
            System.out.print("*");
           }

           for(int j=1;j<=2*(4-i);j++)
           {
            System.out.print(" ");
           }

          for(int j=1;j<=i;j++)
          {
           System.out.print("*");
          }
        System.out.println();
        }
      break;


     case 10:
      System.out.println("Exiting!...");
      System.exit(0);  // Exit the entire program
      break;
    
    default:
     System.out.print("Enter Correct Choice");
     break;
  
      }
    }
  }
}