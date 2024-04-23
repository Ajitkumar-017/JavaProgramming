import java.io.*;
import java.util.Scanner;
import java.nio.file.Files;

public class FileManipulation {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java FileOperations <filename>");
            System.exit(1);
        }

        String filename = args[0];
        File file = new File(filename);
        Scanner scanner = new Scanner(System.in);

        try {
            if (file.exists()) {
                System.out.println("Contents of the file:");
                BufferedReader reader = new BufferedReader(new FileReader(file));
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
                reader.close();
            } else {
                System.out.println("File does not exist. Creating a new file.");
                file.createNewFile();
            }

            System.out.println("Do you want to add data at the end of file or replace specified text? (1/2): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            if (choice == 1) {
                System.out.println("Enter the data to append: ");
                String data = scanner.nextLine();
                BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
                writer.write(data);
                writer.newLine();
                writer.close();
            } else if (choice == 2) {
                System.out.println("Enter the text to search for: ");
                String searchText = scanner.nextLine();
                System.out.println("Enter the text to replace with: ");
                String replaceText = scanner.nextLine();

                String fileContent = new String(Files.readAllBytes(file.toPath()));
                String updatedContent = fileContent.replaceAll(searchText, replaceText);

                BufferedWriter writer = new BufferedWriter(new FileWriter(file));
                writer.write(updatedContent);
                writer.close();
            }

            System.out.println("File updated successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
