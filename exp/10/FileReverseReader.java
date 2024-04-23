import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class FileReverseReader {
    public static void main(String[] args) {
        LinkedList<String> lines = new LinkedList<>();

        // Read the file and store each line in a LinkedList
		
        try {
			FileReader f=new FileReader("sample.txt");
			BufferedReader br = new BufferedReader(f);
		     
            String LineReaded;
            while ((LineReaded = br.readLine()) != null) {
                lines.add(LineReaded);
            }
        } catch (IOException  e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }

        // Print the lines in reverse order
        System.out.println("Lines in reverse order:");
        for (int i = lines.size() - 1; i >= 0; i--) {
            System.out.println(lines.get(i));
        }
    }
}
