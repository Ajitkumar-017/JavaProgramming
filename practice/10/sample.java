import java.util.LinkedList;
import java.io.*;
import java.util.Scanner;

public class sample {
    public static void main(String[] args) {
        try {
            LinkedList<String> lines = new LinkedList<>();
            File file = new File("sample.txt");
            Scanner scan = new Scanner(file);
         
            while (scan.hasNext()) {
                String data = scan.nextLine();
                lines.add(data);
            }
      
            for (int i = lines.size() - 1; i >= 0; i--) {
                System.out.println(lines.get(i)); 
            }
            
            scan.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Error: Unable to read file.");
            e.printStackTrace();
        }
    }
}
