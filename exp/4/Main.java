import java.util.Scanner;

public class Main
{
    public static void main(String args[])
    {
        int E;
        int N;
        int count=0;
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter Energy E");
        E=scan.nextInt();
        if(E>10000 && E<1)
        System.out.println("Wrong input!");
        System.out.print("Enter no of Exercises N: ");
        N=scan.nextInt();
        if(N>10000 && N<1)
        System.out.println("Wrong input!");
        int [] A=new int[10];
        System.out.print("Enter values of each exercise: ");
        for(int i=0;i<=N-1;i++)
        {
            int elem=scan.nextInt();
            A[i]=elem;
        }

          for(int i=0;i<=N;i++)
        
             int sum=A[i]+A[i+1];
        
        
        if(E%sum==0)
        {
            System.out.println("count of exercises you can do: "+count);
            System.out.println("E="+E);
        }
        else
        {
            System.out.println("-1");
            System.out.println("E="+E);
        }
    }
}