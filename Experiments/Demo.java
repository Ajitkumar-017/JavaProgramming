import math.convert.*;
import math.Statistics;
import java.util.Scanner;


public class Demo {
    public static void main(String args[])
    {
        Statistics obj=new Statistics();
        int n;
		int [] array=new int[10];
        System.out.println("\n1.Mean\n2.median\n3.Average\n4.Standard Deviation\n5.Convert DecimalToOctal\n6.Convert Binary To Hex \n7.Convert Octal To Decimal\n8.Convert Hex to Binary\n9.Exit");
        while(true){
        System.out.print("\nEnter Your Choice: ");
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        switch(choice)
        {
            case 1:
            {
                System.out.print("\nEnter size of array: ");
                n=sc.nextInt();
				array=getArray(n);
                obj.mean(array,n);
          }
        break;
        case 2:
        {
            System.out.print("\nEnter size of array: ");
            n=sc.nextInt();
			array=getArray(n);
            obj.median(array,n);
        }
        break;
        case 3:
        {
            System.out.print("\nEnter size of array: ");
            n=sc.nextInt();
			array=getArray(n);
            obj.avg(array,n);
        }
		break;
        case 4:
        {
            System.out.print("\nEnter size of array: ");
            n=sc.nextInt();
			array=getArray(n);
            obj.stddev(array,n);
        }
        break;

            case 5:
        {
            System.out.print("\nEnter Decimal value: ");
            int Decimal=sc.nextInt();
            convert.DecimalToOctal obj1=new convert.DecimalToOctal(Decimal);

        }
        break;
        
        case 6:
        {
            System.out.print("\nEnter Binary value: ");
            long binary=sc.nextLong();
            convert.BinaryToHex obj2=new convert.BinaryToHex(binary);
            
        }
        break;
        
        case 7:
        {
            System.out.print("\nEnter Octal value: ");
            String Octal=sc.next();
            convert.OctalToDecimal obj3=new convert.OctalToDecimal(Octal);
        }
        break;
        
        case 8:
        {
            System.out.print("\nEnter Hex value: ");
            String Hex=sc.next();
            convert.HexToBinary obj4=new convert.HexToBinary(Hex);

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


public static int[] getArray(int n)
		{
		int[] arr=new int[n];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Elements: ");
		for(int i=0;i<n;i++)
		{
			int elem=sc.nextInt();
			arr[i]=elem;
		}
		return arr;
		}
}
