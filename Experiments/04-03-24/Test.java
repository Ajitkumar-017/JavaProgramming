
interface stack 
{
  int size=5;
  void push(String str);
  void pop();
  void display();
  boolean overflow();
  boolean underflow();
}

class IntegerStack implements stack
{
    int[] stack=new int[size];
    String str;
    int top=-1;

    
    public void push(String str)
    {
        if(overflow())
        {
            System.out.println("Stack is full cant insert item");
        }
        else
        {
         int elem=Integer.parseInt(str);
         top++;
         stack[top]=elem;
         System.out.println("Added "+elem+" to stack");
        }
    }

    public void pop()
    {

        if(underflow())
        {
            System.out.println("Stack Already Empty ,cant delete more!");
        }
        else
        {
            System.out.println("Deleted top element: "+stack[top]);
            top--;
        }
    }

    public void display()
    {
        if(underflow())
        System.out.println("Stack is empty");
        else{
     System.out.println("Stack elements are: ");
     for(int i=0;i<=top;i++)
     System.out.println(stack[i]);
        }
    }    

    public boolean overflow()
    {
      if(top==size)
      return true;
      else 
      return false;
    }

    public boolean underflow()
    {
      if(top==-1)
      return true;
      else 
      return false;
    }
}



class StringStack implements stack
{
    String[] stack=new String[size];
    String str;
    int top=-1;

    
    public void push(String str)
    {
        if(overflow())
        {
            System.out.println("Stack is full cant insert item");
        }
        else
        {
       
         top++;
         stack[top]=str;
         System.out.println("Added "+str+" to stack");
        }
    }

    public void pop()
    {

        if(underflow())
        {
            System.out.println("Stack Already Empty ,cant delete more!");
        }
        else
        {
            System.out.println("Deleted top element: "+stack[top]);
            top--;
        }
    }

    public void display()
    {
        if(underflow())
        System.out.println("Stack is empty");
        else{
     System.out.println("Stack elements are: ");
     for(int i=0;i<=top;i++)
     System.out.println(stack[i]);
        }
    }    

    public boolean overflow()
    {
      if(top==size)
      return true;
      else 
      return false;
    }

    public boolean underflow()
    {
      if(top==-1)
      return true;
      else 
      return false;
    }
}



class DoubleStack implements stack
{
    Double[] stack=new Double[size];
    String str;
    int top=-1;

    
    public void push(String str)
    {
        if(overflow())
        {
            System.out.println("Stack is full cant insert item");
        }
        else
        {
       
         top++;
         double elem=Double.parseDouble(str);
         stack[top]=elem;
         System.out.println("Added "+elem+" to stack");
        }
    }

    public void pop()
    {

        if(underflow())
        {
            System.out.println("Stack Already Empty ,cant delete more!");
        }
        else
        {
            System.out.println("Deleted top element: "+stack[top]);
            top--;
        }
    }

    public void display()
    {
        if(underflow())
        System.out.println("Stack is empty");
        else{
     System.out.println("Stack elements are: ");
     for(int i=0;i<=top;i++)
     System.out.println(stack[i]);
        }
    }    

    public boolean overflow()
    {
      if(top==size)
      return true;
      else 
      return false;
    }

    public boolean underflow()
    {
      if(top==-1)
      return true;
      else 
      return false;
    }
}

public class Test
{
    public static void main(String args[])
    {
        IntegerStack obj=new IntegerStack();
        StringStack obj2=new StringStack();
        DoubleStack obj3=new DoubleStack();

        obj.push("10");
        obj.push("20");
        obj.pop();
        obj.display();

        obj2.push("abc");
        obj2.push("pqr");
        obj2.pop();
        obj2.display();

        obj3.push("3.14");
        obj3.push("7.24");
        obj3.pop();
        obj3.display();
    }
}