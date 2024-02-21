abstract class A                               //To create Abstract methods the class must be abstract
{
 abstract void FirstAbstractMethod();         //We only declare methods inside abstract class never write their definition 
 abstract void SecondAbstractMethod();         
   void display()
  {
   System.out.println("Inside display Method (Class A)");
  }
}
class B extends A                          
{ 
  void FirstAbstractMethod()                //We write definitions of abstract method inside child class
  {
    System.out.println("Inside First Abstract method");
  }
    void SecondAbstractMethod()
  {
    System.out.println("Inside Second Abstract method");
  }
  void show()
  {
   System.out.println("Inside Show Method (Class B)");
  }
}

class TestMain
{
  public static void main(String[] args)
  {
    B obj=new B();
	obj.FirstAbstractMethod();
	obj.SecondAbstractMethod();               //abstract methods can be accessed through object of child class
	obj.display();
	obj.show();
  }
}