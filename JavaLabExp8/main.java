// Main.java
// Name: [Your Name]
// PRN: [Your PRN]
// Batch: [Your Batch]
// Entry point for the Student Data Entry application.

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\n--- Student Data Entry Menu ---");
            System.out.println("1. Add Student");
            System.out.println("2. Delete Student");
            System.out.println("3. Search Student");
            System.out.println("4. Display All Students");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number between 1 and 5.");
                continue;
            }

            try {
                switch (choice) {
                    case 1:
                        // Add Student
                        System.out.print("Enter Student ID: ");
                        int id = Integer.parseInt(scanner.nextLine());
                        System.out.print("Enter Student Name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter Student Age: ");
                        int age = Integer.parseInt(scanner.nextLine());

                        Student student = new Student(id, name, age);
                        manager.addStudent(student);
                        System.out.println("Student added successfully.");
                        break;

                    case 2:
                        // Delete Student
                        System.out.print("Enter Student ID to delete: ");
                        int deleteId = Integer.parseInt(scanner.nextLine());
                        manager.deleteStudent(deleteId);
                        System.out.println("Student deleted successfully.");
                        break;

                    case 3:
                        // Search Student
                        System.out.print("Enter Student ID to search: ");
                        int searchId = Integer.parseInt(scanner.nextLine());
                        Student foundStudent = manager.searchStudent(searchId);
                        System.out.println("Student Found: " + foundStudent);
                        break;

                    case 4:
                        // Display All Students
                        List<Student> allStudents = manager.getAllStudents();
                        System.out.println("\n--- All Students ---");
                        for (Student s : allStudents) {
                            System.out.println(s);
                        }
                        break;

                    case 5:
                        // Exit
                        System.out.println("Exiting application. Goodbye!");
                        scanner.close();
                        return;

                    default:
                        System.out.println("Invalid choice. Please select a number between 1 and 5.");
                }
            } catch (DuplicateStudentException | StudentNotFoundException | NoStudentsException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter numeric values where required.");
            }
        }
    }
}
