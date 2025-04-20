// Name: Eric Siqueira
// PRN: 23070126041
// Batch: 2023-27
// Manages student records: add, delete, search, and display.

import java.util.ArrayList;
import java.util.List;

public class Main {
    final private List<Student> students = new ArrayList<>();

    // Adds a new student to the list
    public void addStudent(Student student) throws DuplicateStudentException {
        for (Student s : students) {
            if (s.getId() == student.getId()) {
                throw new DuplicateStudentException("Student with ID " + student.getId() + " already exists.");
            }
        }
        students.add(student);
    }

    // Deletes a student by ID
    public void deleteStudent(int id) throws StudentNotFoundException {
        Student student = findStudentById(id);
        students.remove(student);
    }

    // Searches for a student by ID
    public Student searchStudent(int id) throws StudentNotFoundException {
        return findStudentById(id);
    }

    // Displays all students
    public List<Student> getAllStudents() throws NoStudentsException {
        if (students.isEmpty()) {
            throw new NoStudentsException("No student records available.");
        }
        return new ArrayList<>(students);
    }

    public static void main(String[] args) {
        Main studentSystem = new Main();
        
        try {
            // Add some sample students
            studentSystem.addStudent(new Student(1, "John Doe", 20));
            studentSystem.addStudent(new Student(2, "Jane Smith", 21));
            
            // Display all students
            System.out.println("All Students:");
            List<Student> allStudents = studentSystem.getAllStudents();
            for (Student s : allStudents) {
                System.out.println(s);
            }
            
            // Search for a student
            System.out.println("\nSearching for student with ID 1:");
            Student foundStudent = studentSystem.searchStudent(1);
            System.out.println("Found: " + foundStudent);
            
            // Delete a student
            System.out.println("\nDeleting student with ID 2");
            studentSystem.deleteStudent(2);
            
            // Display updated list
            System.out.println("\nUpdated student list:");
            allStudents = studentSystem.getAllStudents();
            for (Student s : allStudents) {
                System.out.println(s);
            }
            
        } catch (DuplicateStudentException | StudentNotFoundException | NoStudentsException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    // Helper method to find a student by ID
    private Student findStudentById(int id) throws StudentNotFoundException {
        for (Student s : students) {
            if (s.getId() == id) {
                return s;
            }
        }
        throw new StudentNotFoundException("Student with ID " + id + " not found.");
    }
}


