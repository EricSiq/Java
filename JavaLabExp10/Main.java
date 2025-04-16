/* 
 * Name: Eric Siqueira
 * PRN: 23070126041
 * Batch: 2023-27
 */

public class Main {
    
    // Main method: Application entry point
    public static void main(String[] args) {
        // Create and start a thread for printing messages
        Thread printerThread = new Thread(new TaskPrinter());
        printerThread.start();

        // Create and start a thread for performing calculation tasks
        Thread calculatorThread = new Thread(new TaskCalculator());
        calculatorThread.start();

        // Call an additional operation on the main thread
        performAdditionalOperation();
    }
    
    // This method simulates an additional everyday operation in the main thread.
    public static void performAdditionalOperation() {
        System.out.println("Main Thread: Performing an additional operation.");
    }
}
