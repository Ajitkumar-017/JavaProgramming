import java.util.*;
import java.util.ArrayList;
public class LinearSearch
{
  public static void LinearSearch(int k,ArrayList<Integer> ArrList)
  {
   int flag=0;
    for(int i=0;i<ArrList.size();i++)
    {
       if(ArrList.get(i)==k){
       flag=-1;
       System.out.print("Found at"+i+1+"location");
      }
     }
      if(flag==0)
      System.out.print(k+" Not Found!");
    }
  public static void main(String[] args)
  {
   ArrayList<Integer> ArrList=new ArrayList<>();
   Scanner scan=new Scanner(System.in);
   System.out.print("Enter elements for ArrListay and enter -1 to stop: ");
   int n=scan.nextInt();
   ArrList.add(n);
   while(n!=-1)
   {
    n=scan.nextInt();
    ArrList.add(n);
   }
   System.out.print("Enter key to search: ");
   int k=scan.nextInt();
   LinearSearch(k,ArrList);
  }
}