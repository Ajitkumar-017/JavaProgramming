import java.util.*;
import java.util.ArrayList;
public class LargestInArray {
     public static void main(String[] args)
    {
        int largest=Integer.MIN_VALUE;           //Minus Infinity
        ArrayList<Integer> arr=new ArrayList<>();
        System.out.print("Enter elements of Array(Enter -1 to stop): ");
        Scanner scan =new Scanner(System.in);
        int n=-0;         
        //Taking Input Array
        while(n!=-1)
        {
            n=scan.nextInt();
            if(n!=-1)
            arr.add(n);
        }
        for(int i=0;i<arr.size();i++)
        {
          if(largest<arr.get(i))
          {
            largest=arr.get(i);
          }   
        }
        for(int num: arr)
        System.out.println(num);
        System.out.print("largest in given array: "+ largest);
    }
    
}
