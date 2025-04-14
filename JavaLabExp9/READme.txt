JavaLabExp9



## Files and Functions

### Main.java
- **main(String[] args):** Launches the application, processes user input, and calls relevant functions.
- **displayMenu():** Displays the list of operations: Add, Update, Delete, List All, and Exit.

### Student.java
- **Student(String name, int age, String email):** Constructor for new students.
- **Student(int id, String name, int age, String email):** Constructor for existing students (used for update).
- **Getters/Setters:** For all attributes.
- **toString():** For easy printing of student details.

### DBConnection.java
- **getConnection():** Returns a `Connection` object to the MySQL database.  
  *Update the URL, USER, and PASSWORD as per your MySQL configuration.*

### StudentDAO.java
- **addStudent(Student student):** Inserts a new student record into the database.
- **updateStudent(Student student):** Updates an existing student record.
- **deleteStudent(int studentId):** Deletes a student record based on student ID.
- **listAllStudents():** Retrieves and displays all student records.

## Git Workflow
- Each file (Main.java, Student.java, DBConnection.java, StudentDAO.java, and README.md) is committed separately.
- Each function in the DAO (and other major blocks) is committed as a separate change.
- Use meaningful commit messages that describe the changes.

## Setup Instructions
1. Install the MySQL server and create a database named `studentdb`.
2. Create a table named `students` with the following example SQL:

```sql
CREATE TABLE students (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    age INT NOT NULL,
    email VARCHAR(100) NOT NULL
);
