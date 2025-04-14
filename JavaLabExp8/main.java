// Name: Eric Siqueira
// PRN: 23070126041
// Batch: 2023-27
// Entry point for the Student Data Entry application.
import java.util.ArrayList;
import java.util.List;

public class StudentManager {
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

