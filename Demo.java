import math.convert.*;
import math.Statistics;
import java.util.Scanner;


public class Demo {
    public static void main(String args[])
    {
        Statistics obj=new Statistics();
 
        System.out.println("\n1.Mean\n2.median\n3.Average\n4.Standard Deviation\n5.Convert DecimalToOctal\n6.Convert Binary To Hex \n7.Convert Octal To Decimal\n 8.Convert Hex to Binary\n9.Exit");
        while(true){
        System.out.println("Enter Your Choice: ");
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        switch(choice)
        {
            case 1:
            {
            obj.mean(5);
          }
        break;
        case 2:
        {
            obj.median(5);
        }
        break;
        case 3:
        {
           obj.avg(5);
        }
        case 4:
        {
            obj.stddev(5);
        }
        break;

        case 5:
        {
            convert.DecimalToOctal obj1=new convert.DecimalToOctal(100);

        }
        break;
        
        case 6:
        {
            convert.BinaryToHex obj2=new convert.BinaryToHex(100);
            
        }
        break;
        
        case 7:
        {
            
            convert.OctalToDecimal obj3=new convert.OctalToDecimal("100");
        }
        break;
        
        case 8:
        {
            convert.HexToBinary obj4=new convert.HexToBinary("ABF");

        }
        break;

        case 9:
        {
            System.out.println("Exiting...");
         System.exit(0);
        }
        break;
        default:System.out.println("Wrong Choice!");
        }
    }
    }
}
