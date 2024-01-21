public class CallByValue
{
  public static void swap(int a,int b)   //Call by values- copies of a and b are given
  {
   int temp;
   a=b;
   b=temp;
  }
  public static void main(String[] args)
  {
   int a=10;
   int b=5;
   swap(a,b);
   System.out.println("a="+a);
   System.out.println("b="+b);
  }
}

//****************************************** Notes***********************************************
//Java is always call by value there is no such thing exists as call by reference in java
//In call by value , the copy of original value is always passed to a function
//and those values have limited scope up to that function they will not change
//the original value does not change
//for example in above program after swapping the variables we are printing values of a & b
//but the output is original value why?
// Because in call by value copies of original values are passed not the original address itself
//and also the scope is limited to that function only