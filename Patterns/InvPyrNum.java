//Inverted half Pyramid with numbers
public class InvPyrNum
{
  public static void main(String[] args)
  {
    int n=5;
    for(int i=1;i<=n;i++)
    {
      for(int j=1;j<=6-i;j++)
      {
        System.out.print(j);
      }
     System.out.println();
    }
  }
}