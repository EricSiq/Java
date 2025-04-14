// Thrown when there are no student records to display.

public class NoStudentsException extends Exception {
    public NoStudentsException(String message) {
        super(message);
    }
}
