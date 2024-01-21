public class Scope
{
 public static void PrintS()
 {
  int s=45;
  System.out.print(s);
 }
 public static void main(String[] args)
 {
   {
    int BS=10;
   }
  System.out.print(BS);                 //Gives Error- BlockScope
  System.out.print(s);     		//Gives Error
  
 }
}



//*****************************************Notes*********************************************************
//There are Three types of scopes in methods or in java
//1.Method scope 2.Block Scope 3.class Scope
//A variable declared inside a method is only accessible to that method just like in above
//exmple will give error s is not defined
//2.Block is defined by {} opening and closing curly braces anything declared inside
//a block cannot be accessed directly except passed as a parameter that is why when 
//you  try to use a varible defined inside for loop like a iterator i outside the loop it gives an error
//3.Visibily mode defines class Scope  in above example public is a visibility mode