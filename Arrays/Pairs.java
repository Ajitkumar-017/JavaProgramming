import java.util.*;
import java.util.ArrayList;
public class Pairs
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
        for(int i=0;i<arr.size()-1;i++)
        {
          int curr=arr.get(i);
          for(int j=i+1;j<arr.size();j++)
          {
            System.out.print("("+arr.get(i)+", "+arr.get(j)+")");
          }
          System.out.println();
        }
        
    }
}