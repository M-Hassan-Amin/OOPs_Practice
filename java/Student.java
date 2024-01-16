import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Student {
    private int id;
    private String name;
    private String contactNumber;

    // Constructor to initialize a Student object with data
    public Student(int id, String name, String contactNumber) {
        this.id = id;
        this.name = name;
        this.contactNumber = contactNumber;
    }

    // Method to write student data to an Excel file, throws IOException
    private static void writeStudentsToExcel(List<Student> students, String filePath) throws IOException {
        // Using try-with-resources to automatically close the FileOutputStream
        try (FileOutputStream fileOut = new FileOutputStream(filePath)) {
            // Use StringBuilder to construct the content of the Excel file
            StringBuilder content = new StringBuilder("ID\tName\tContact Number\n");

            // Iterate over the list of students and append their data to the content
            for (Student student : students) {
                content.append(student.id).append("\t").append(student.name).append("\t")
                        .append(student.contactNumber).append("\n");
            }

            // Write the content to the Excel file
            fileOut.write(content.toString().getBytes());
        }
    }

    // Main method where the program starts execution
    public static void main(String[] args) throws IOException {
        // Create a list to store Student objects
        List<Student> students = new ArrayList<>();
        // Student stud1 = new Student(3, "ALi", "124541236");
        // students.add(stud1);
        students.add(new Student(1, "Hassan", "1234567890"));
        students.add(new Student(2, "Sabhee", "9876543210"));

        // Call the method to write student data to an Excel file
        writeStudentsToExcel(students, "students.xlsx");

        // Print a success message to the console
        System.out.println("Excel file created successfully.");
    }

}
