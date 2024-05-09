import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StudentAttendance {
    public static void main(String[] args) {
        String fileName = "attendance.txt";  // Replace with your file name

        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                String studentName = scanner.nextLine();
                System.out.println(studentName + " attended.");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        }
    }
}
