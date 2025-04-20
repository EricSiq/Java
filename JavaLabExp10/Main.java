/* 
 * Name: Eric Siqueira
 * PRN: 23070126041
 * Batch: 2023-27
 */
// Main.java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean running = true;
        
        try (Scanner scanner = new Scanner(System.in)) {
            while (running) {
                System.out.println("=== Calculator Menu ===");
                System.out.println("1. Addition");
                System.out.println("2. Subtraction");
                System.out.println("3. Multiplication");
                System.out.println("4. Division");
                System.out.println("5. Exit");
                System.out.print("Enter your choice (1-5): ");
                
                int choice = scanner.nextInt();
                
                if (choice == 5) {
                    System.out.println("Thank you for using the calculator. Goodbye!");
                    running = false;
                    continue;
                }
                
                if (choice >= 1 && choice <= 4) {
                    System.out.print("Enter first number: ");
                    double num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    double num2 = scanner.nextDouble();
                    
                    // Start operation thread only (removed printer thread)
                    Thread operationThread = new Thread(new OperationTask(num1, num2, choice));
                    operationThread.start();

                    // Wait for operation to complete
                    try {
                        operationThread.join();
                        System.out.println(); // Single line break before next menu
                    } catch (InterruptedException e) {
                        System.out.println("Thread interrupted!");
                    }
                } else if (choice != 5) {
                    System.out.println("Invalid choice! Please enter a number between 1 and 5.");
                    scanner.nextLine(); // consume invalid input
                }
            }
        }
    }
}
