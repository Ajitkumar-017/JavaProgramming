import java.io.*;

public class StudentInfoIO {
    public static void writeStudentToFile(Student student, String filename) {
        try (FileOutputStream fos = new FileOutputStream(filename);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(student);
            System.out.println("Student information written to file successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readStudentFromFile(String filename) {
        try (FileInputStream fis = new FileInputStream(filename);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            Student student = (Student) ois.readObject();
            System.out.println("Student information read from file:");
            System.out.println(student);
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Enter student information:");
            System.out.print("Age: ");
            int age = Integer.parseInt(reader.readLine());
            System.out.print("Weight (in kg): ");
            double weight = Double.parseDouble(reader.readLine());
            System.out.print("Height (in cm): ");
            double height = Double.parseDouble(reader.readLine());
            System.out.print("City: ");
            String city = reader.readLine();
            System.out.print("Phone: ");
            String phone = reader.readLine();
            Student student = new Student(age, weight, height, city, phone);
            String filename = "student_info.txt";
            writeStudentToFile(student, filename);
            readStudentFromFile(filename);
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
