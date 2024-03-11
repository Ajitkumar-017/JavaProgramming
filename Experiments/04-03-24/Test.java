import java.util.Scanner;

interface stack { // All methods inside interface are abstaract, no any concrete method is allowed
    int size = 5; // All variables are of type static final - i.e.common to all objects and
                  // constant

    void push(String str); // All methods inside an interface has public access specifier by default which
                           // cannot be changed

    void pop(); // No need to write public as it is declared public implicitely

    void display();

    boolean overflow();

    boolean underflow();
}

class IntegerStack implements stack {               //implements keyword is used to inherit an interface  
    int[] stack = new int[size];
    String str;
    int top = -1;

    public void push(String str) {                    //methods must be declared public explicitely in function definition
        if (overflow()) {
            System.out.println("Stack is full cant insert item");
        } else {
            int elem = Integer.parseInt(str);
            top++;
            stack[top] = elem;
            System.out.println("Added " + elem + " to stack");
        }
    }

    public void pop() {

        if (underflow()) {
            System.out.println("Stack Already Empty ,cant delete more!");
        } else {
            System.out.println("Deleted top element: " + stack[top]);
            top--;
        }
    }

    public void display() {
        if (underflow())
            System.out.println("Stack is empty");
        else {
            System.out.println("Stack elements are: ");
            for (int i = 0; i <= top; i++)
                System.out.println(stack[i]);
        }
    }

    public boolean overflow() {
        if (top == size - 1)
            return true;
        else
            return false;
    }

    public boolean underflow() {
        if (top == -1)
            return true;
        else
            return false;
    }
}

class StringStack implements stack {
    String[] stack = new String[size];
    String str;
    int top = -1;

    public void push(String str) {
        if (overflow()) {
            System.out.println("Stack is full cant insert item");
        } else {

            top++;
            stack[top] = str;
            System.out.println("Added " + str + " to stack");
        }
    }

    public void pop() {

        if (underflow()) {
            System.out.println("Stack Already Empty ,cant delete more!");
        } else {
            System.out.println("Deleted top element: " + stack[top]);
            top--;
        }
    }

    public void display() {
        if (underflow())
            System.out.println("Stack is empty");
        else {
            System.out.println("Stack elements are: ");
            for (int i = 0; i <= top; i++)
                System.out.println(stack[i]);
        }
    }

    public boolean overflow() {
        if (top == size - 1)
            return true;
        else
            return false;
    }

    public boolean underflow() {         //All methods defined in interface must be implemented in child class
        if (top == -1)
            return true;
        else
            return false;
    }
}

class DoubleStack implements stack {
    Double[] stack = new Double[size];
    String str;
    int top = -1;

    public void push(String str) {
        if (overflow()) {
            System.out.println("Stack is full cant insert item");
        } else {
            top++;
            double elem = Double.parseDouble(str);
            stack[top] = elem;
            System.out.println("Added " + elem + " to stack");
        }
    }

    public void pop() {

        if (underflow()) {
            System.out.println("Stack Already Empty ,cant delete more!");
        } else {
            System.out.println("Deleted top element: " + stack[top]);
            top--;
        }
    }

    public void display() {
        if (underflow())
            System.out.println("Stack is empty");
        else {
            System.out.println("Stack elements are: ");
            for (int i = 0; i <= top; i++)
                System.out.println(stack[i]);
        }
    }

    public boolean overflow() {
        if (top == size - 1)
            return true;
        else
            return false;
    }

    public boolean underflow() {
        if (top == -1)
            return true;
        else
            return false;
    }
}

public class Test1 {
    public static void main(String args[]) {
        IntegerStack obj1 = new IntegerStack(); // Interfaces cant be instanciated
        StringStack obj2 = new StringStack();
        DoubleStack obj3 = new DoubleStack();
        Scanner scan = new Scanner(System.in);
        int choice, Subchoice;
        String str;
        while (true) {
            System.out.println("\n1.IntegerStack\n2.StringStack\n3.DoubleStack\n4.Exit");
            System.out.print("Enter Your Choice: ");
            choice = scan.nextInt();
            switch (choice) {
                case 1: {
                  System.out.println("\n1.Push\n2.Pop\n3.Dispay\n4.Previos Menu\n5.Exit");
				  do {
                        System.out.print("\nEnter Your Choice: ");
                        Subchoice = scan.nextInt();
                        switch (Subchoice) {
                            case 1: {
                                System.out.print("\nEnter a number to push to IntegerStack: ");
                                str = scan.next();
                                obj1.push(str);
                            }
                                break;

                            case 2: obj1.pop();
                            break;

                            case 3: obj1.display();
                            break;

                            case 4:
                                break;

                            case 5: {
                                System.out.println("Exiting Program...");
                                scan.close();
                                System.exit(0);
                            }
                                break;

                            default: System.out.println("Wrong choice");
                        }
                    } while (Subchoice != 4);

                }
                 break;

                case 2: 
				{
                   System.out.println("\n1.Push\n2.Pop\n3.Dispay\n4.Previous Menu\n5.Exit");
					do {
                        System.out.print("\nEnter Your Choice: ");
                        Subchoice = scan.nextInt();
                        switch (Subchoice) {
                            case 1: {
                                System.out.print("\nEnter a String to push to StringStack: ");
                                str = scan.next();
                                obj2.push(str);
                            }
                                break;

                            case 2: obj2.pop();
                            break;

                            case 3: obj2.display();
                            break;

                            case 4:
                                break;

                            case 5: {
                                System.out.println("Exiting Program...");
                                scan.close();
                                System.exit(0);
                            }
                                break;

                            default:System.out.println("Wrong choice");
                        }
                    } while (Subchoice != 4);
                }
                    break;

                case 3: 
				{ 
                 System.out.println("\n1.Push\n2.Pop\n3.Dispay\n4.Previous Menu\n5.Exit");
				 do {
                        System.out.println("\nEnter Your Choice: ");
                        Subchoice = scan.nextInt();
                        switch (Subchoice) {
                            case 1: {
                                System.out.print("\nEnter a String to push to DoubleStack: ");
                                str = scan.next();
                                obj3.push(str);
                            }
                                break;

                            case 2: obj3.pop();
                            break;

                            case 3: obj3.display();
                            break;

                            case 4:
                                break;

                            case 5: {
                                System.out.println("Exiting Program...");
                                scan.close();
                                System.exit(0);
                            }
                            break;

                            default: System.out.println("Wrong choice");
                        }
                    } while (Subchoice != 4);
                }
                    break;

                case 4: {
                    System.out.println("Exiting Program...");
                    scan.close();
                    System.exit(0);
                }
                break;

                default: System.out.println("Wrong choice");

            }
        }
    }
}
