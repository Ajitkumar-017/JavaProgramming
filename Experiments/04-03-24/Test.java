import java.util.Scanner;

interface stack {
    int size = 5;

    void push(String str);

    void pop();

    void display();

    boolean overflow();

    boolean underflow();
}

class IntegerStack implements stack {
    int[] stack = new int[size];
    String str;
    int top = -1;

    public void push(String str) {
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

    public boolean underflow() {
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

public class Test {
    public static void main(String args[]) {
        IntegerStack obj1 = new IntegerStack();
        StringStack obj2 = new StringStack();
        DoubleStack obj3 = new DoubleStack();
        Scanner scan = new Scanner(System.in);
        int choice;
        String str;
        while (true) {
            System.out.println("\n1.IntegerStack\n2.StringStack\n3.DoubleStack\n4.Exit");
            System.out.print("Enter Your Choice: ");
            choice = scan.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("\n11.Push\n12.Pop\n13.Dispay\n14.Exit");
                    System.out.print("Enter Your Choice: ");
                    int Subchoice = scan.nextInt();
                    switch (Subchoice) {
                        case 11: {
                            System.out.print("\nEnter a number to push to IntegerStack: ");
                            str = scan.next();
                            obj1.push(str);
                        }
                            break;

                        case 12: {
                            obj1.pop();
                        }
                            break;

                        case 13: {
                            obj1.display();
                        }
                            break;

                        case 14: {
                            System.out.println("Exiting Program...");
                            scan.close();
                            System.exit(0);
                        }
                            break;

                        default:
                            System.out.println("Wrong choice");
                    }
                }
                    break;

                case 2: {
                    System.out.println("\n21.Push\n22.POP\n23.Dispay\n24.Exit");
                    System.out.print("Enter Your Choice: ");
                    int Subchoice = scan.nextInt();
                    switch (Subchoice) {
                        case 21: {
                            System.out.print("\nEnter a String to push to StringStack: ");
                            str = scan.next();
                            obj2.push(str);
                        }
                            break;

                        case 22: {
                            obj2.pop();
                        }
                            break;

                        case 23: {
                            obj2.display();
                        }
                            break;

                        case 24: {
                            System.out.println("Exiting Program...");
                            scan.close();
                            System.exit(0);
                        }
                            break;

                        default:
                            System.out.println("Wrong choice");
                    }
                }
                    break;

                case 3: {
                    System.out.println("\n31.Push\n32.POP\n33.Dispay\n34.Exit");
                    System.out.println("Enter Your Choice: ");
                    int Subchoice = scan.nextInt();
                    switch (Subchoice) {
                        case 31: {
                            System.out.print("\nEnter a String to push to DoubleStack: ");
                            str = scan.next();
                            obj3.push(str);
                        }
                            break;

                        case 32: {
                            obj3.pop();
                        }
                            break;

                        case 33: {
                            obj3.display();
                        }
                            break;

                        case 34: {
                            System.out.println("Exiting Program...");
                            scan.close();
                            System.exit(0);
                        }
                            break;

                        default:
                            System.out.println("Wrong choice");
                    }
                }
                    break;

                case 4: {
                    System.out.println("Exiting Program...");
                    scan.close();
                    System.exit(0);
                }
                    break;

                default:
                    System.out.println("Wrong choice");

            }
        }
    }
}
