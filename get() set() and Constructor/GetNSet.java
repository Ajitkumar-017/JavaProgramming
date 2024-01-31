class HelloWorld
{
  int a=20;
 //public HelloWorld(int a)    //we used a parameterized constructor 
 //{
   //this.a=a;
 //}
 public void set(int a)        //set method is used to set a value for a variable inside object. You can give it name as set_a
 {
  this.a=a;                   //this points to current object
 }
 public int get()             //get ,method is used to retrieve value from a object. You can give it name as get_a
 {
  return a;
 }
 public void msg()
 {
  System.out.println("Value of a in msg method is ..."+a);
 }
  public void show()
 { 
  int a=100;                                //we have set the value of a to 100
 System.out.println("Value of a in show method is ..."+a);
 }
}

public class GetNSet
{
 public static void main(String[] args)
 {
  HelloWorld o1=new HelloWorld();
  o1.set(63);
  o1.msg();
  o1.show();
  HelloWorld o2=new HelloWorld();
  o2.set(36);
  o2.show();
  o2.msg(); 
  System.out.println("Deriving values using get method for object 1: "+o2.get());
  System.out.println("Deriving value using get method for object 2: "+o1.get());
  }
}