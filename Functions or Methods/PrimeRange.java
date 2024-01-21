import java.util.*;
import java.util.ArrayList;
public class primeRange
{
  public static void prime(int low,int high)
  {
    int flag=0;
    ArrayList<Integer> arr=new ArrayList<>();
   for(int i=low;i<=high;i++)
  {
   if(isPrime(i))
    arr.add(i);
   }
    System.out.print(arr);
    }


  public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
  }
  public static void main(String[] args)
  {
   Scanner scan=new Scanner(System.in);
   System.out.print("Give lower bound: ");
   int low=scan.nextInt();
   System.out.print("Give upper bound: ");
   int high=scan.nextInt();
   prime(low,high);
  }
}