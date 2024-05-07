import java.io.*;
import java.util.Scanner;

public class sample {
    public static void main(String[] args) {
        try {
            File file = new File("sample.txt");

            // Writing data to file
            FileOutputStream fout = new FileOutputStream(file);
            DataOutputStream dos = new DataOutputStream(fout);

            Scanner scan = new Scanner(System.in);

            System.out.print("Enter name: ");
            dos.writeUTF(scan.next());

            System.out.print("Enter age: ");
            dos.writeInt(scan.nextInt());

            System.out.print("Enter weight: ");
            dos.writeInt(scan.nextInt());

            System.out.print("Enter height: ");
            dos.writeInt(scan.nextInt());

            System.out.print("Enter phone: ");
            dos.writeUTF(scan.next()); // Writing phone number as string

            dos.close(); // Closing the stream

            // Reading data from file
            FileInputStream fis = new FileInputStream(file);
            DataInputStream dis = new DataInputStream(fis);

            String name = dis.readUTF();
            int age = dis.readInt();
            int weight = dis.readInt();
            int height = dis.readInt();
            String phone = dis.readUTF(); // Reading phone number as string

            dis.close(); // Closing the stream

            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Weight: " + weight);
            System.out.println("Height: " + height);
            System.out.println("Phone: " + phone);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
