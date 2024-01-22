import java.util.*;
public class Strings
{
  public static void main(String[] args)
  {
   while(true)
   {
    System.out.print("\n1.String Concatenation\n2.String Traversing\n3.String Compare\n4.String Length\n5.String Compression\n6.Exit\n");
    System.out.print("Enter Your Choice: ");
    Scanner scan=new Scanner(System.in);
    int choice=scan.nextInt();
    switch(choice)
   {
    case 1:
      scan.nextLine();                          //We must always use a scan.nextLine() when we take input as integer first then want to take string as an input
      System.out.print("Give First String: ");  //Because after we take integer as input a space line or a blank line is generated
      String str1=scan.nextLine();              //that blank line could be problematic to nextLine(), (YOU can use next()as it will only consume words not a blank line)
      System.out.print("Give Second String: ");  //But in our case we have to as much as input including space , use want to give that is why we consumed that blank line first
      String str2=scan.nextLine();
      String str=str1+str2;
      System.out.print(str);
    break;

    case 2:
      scan.nextLine();
      System.out.print("Give a String: ");
      String string=scan.nextLine();
      for(int i=0;i<string.length();i++)
       System.out.println(string.charAt(i));
      break;
   
     case 3:
         scan.nextLine();
      System.out.print("Give First String: ");
      String string1=scan.nextLine();
      System.out.print("Give Second String: ");
      String string2=scan.nextLine();
      if(string1.equals(string2))			//Don't use == to check if two strings are equal or not if you use == it only check if the two objects of class string are same or not
         System.out.print("Both Strings are equals");  //In short == does not check if two strings have same values if both are pointing to same string then it gives true
      else
         System.out.print("Strings are not Equal\n");
     //String string1="Tony";
     //String string2=new String("Tony");     
     //if(string1==string2)                           //output will be false because we are comparing two objects of class string not their independent values 
     //System.out.print("True")
     //else System.out.print("False")
    break;
  
    case 4:
        scan.nextLine();
      System.out.print("Give String: ");
      String Stringl=scan.nextLine();
      System.out.println("String length is : "+ Stringl.length());
     break;
   
    case 5:
 scan.nextLine();
        System.out.print("Give a String: ");
        String stringCompreh = scan.nextLine();
        StringBuilder compressedString = new StringBuilder();

        int count = 1;

        for (int i = 0; i < stringCompreh.length() - 1; i++) {
            if (stringCompreh.charAt(i) == stringCompreh.charAt(i + 1)) {
                count++;
            } else {
                compressedString.append(stringCompreh.charAt(i));
                compressedString.append(String.format("%02d", count));
                count = 1;
            }
        }

        // Handling the last character
        compressedString.append(stringCompreh.charAt(stringCompreh.length() - 1));
        compressedString.append(String.format("%02d", count));

        System.out.println(compressedString.toString());
   
   case 6:
      System.out.print("Exiting...");
      System.exit(0);
   }
  }
 }
}