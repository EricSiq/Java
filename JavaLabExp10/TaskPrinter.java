public class TaskPrinter implements Runnable {
    
    // Overriding the run method to define the thread's behavior.
    @Override
    public void run() {
        // Loop to simulate printing status messages
        for (int i = 1; i <= 5; i++) {
            System.out.println("Printer Thread: Printing message " + i);
            try {
                // Sleep for 1 second to simulate a delay between prints
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // Exception handling block for thread interruptions
                System.out.println("Printer Thread: Interrupted!");
            }
        }
    }
}
