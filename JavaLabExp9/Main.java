/*
 * Name: Eric Siqueira
 * PRN: 23070126041
 * Batch: 2023-27
 */

import java.util.Scanner;

public class Main {

    // Displays the menu options to the user.
    public static void displayMenu() {
        System.out.println("\n==== Student Data Entry Application ====");
        System.out.println("1. Add Student");
        System.out.println("2. Update Student");
        System.out.println("3. Delete Student");
        System.out.println("4. List All Students");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }

    // Main function that runs the application.
    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO();

        try (Scanner scanner = new Scanner(System.in)) {
            int choice;
            do {
                displayMenu();
                choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (choice) {
                    case 1 -> {
                        System.out.print("Enter student name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter student age: ");
                        int age = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Enter student email: ");
                        String email = scanner.nextLine();
                        Student student = new Student(name, age, email);
                        dao.addStudent(student);
                    }
                    case 2 -> {
                        System.out.print("Enter the student ID to update: ");
                        int updateId = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Enter new name: ");
                        String newName = scanner.nextLine();
                        System.out.print("Enter new age: ");
                        int newAge = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Enter new email: ");
                        String newEmail = scanner.nextLine();
                        Student updatedStudent = new Student(updateId, newName, newAge, newEmail);
                        dao.updateStudent(updatedStudent);
                    }
                    case 3 -> {
                        System.out.print("Enter the student ID to delete: ");
                        int deleteId = scanner.nextInt();
                        dao.deleteStudent(deleteId);
                    }
                    case 4 -> dao.listAllStudents();
                    case 5 -> System.out.println("Exiting application.");
                    default -> System.out.println("Invalid choice. Please try again.");
                }
            } while (choice != 5);
        }
    }
}
