//StudentOperation.java
import java.sql.*;
import java.util.*;
public class StudentOperations{
    public static final String URL = "jdbc:mysql://localhost:3306/student_db";
    public static final String USER="root";
    private static final String PASSWORD="sit123";
    @SuppressWarnings("CallToPrintStackTrace")
    public void insertStudent() {
        try {
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement stmt = conn.prepareStatement("Insert into students(PRN,Name,Branch,Batch,CGPA) VALUES(?,?,?,?,?)");
            Scanner scan = new Scanner(System.in);
            
            System.out.println("Enter PRN");
            int prn = scan.nextInt();
            scan.nextLine(); // consume newline
            
            System.out.println("Enter Name");
            String name = scan.nextLine();
            
            System.out.println("Enter branch");
            String branch = scan.nextLine();
            
            System.out.println("Enter batch");
            String batch = scan.nextLine();
            
            System.out.println("Enter CGPA");
            float cgpa = scan.nextFloat();
            
            stmt.setInt(1, prn);
            stmt.setString(2, name);
            stmt.setString(3, branch);
            stmt.setString(4, batch);
            stmt.setFloat(5, cgpa);
            
            int affectedRows = stmt.executeUpdate();
            if (affectedRows > 0) {
                System.out.println("Student Data Inserted.");
            }
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
}
