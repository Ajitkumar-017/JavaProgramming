import java.util.*;
import java.util.ArrayList;
public class ReverseArray
{
    public static void main(String[] args)
    {
        ArrayList<Integer> arr=new ArrayList<>();
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter elements of Array(Enter -1 to stop): ");
        int n=-0;         
        //Taking Input Array
        while(n!=-1)
        {
            n=scan.nextInt();
            if(n!=-1)
            arr.add(n);
        }
        for(int i=arr.size()-1;i>=0;i--)
         System.out.println(arr.get(i));
         for(int j=0;j<arr.size();j++)
         System.out.println(arr.get(j));
          int size=arr.size();
          System.out.print(size);
    }
}