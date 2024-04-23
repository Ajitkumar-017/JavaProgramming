import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionHandlingExample {

    public static void main(String[] args) {
        try {
           
            readFile("non_existing_file.txt");

            int result = 5/0;

            int number = Integer.parseInt("abc");

  
            int[] arr = {1, 2, 3};
            System.out.print(arr[5]);


            readTextFile("existing_file.txt");
        } catch (IOException e) {
            System.err.println("IOException occurred: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.err.println("ArithmeticException occurred: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("NumberFormatException occurred: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("ArrayIndexOutOfBoundsException occurred: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Unknown exception occurred: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed");
        }
    }


    public static void readFile(String filename) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }

 


    public static void readTextFile(String filename) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }
}
