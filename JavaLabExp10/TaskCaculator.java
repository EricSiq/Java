public class TaskCalculator implements Runnable {
    
    // Overriding the run method to define the thread's behavior.
    @Override
    public void run() {
        int sum = 0;
        // Loop to calculate the running sum of numbers from 1 to 5.
        for (int i = 1; i <= 5; i++) {
            sum += i;
            System.out.println("Calculator Thread: Current Sum is " + sum);
            try {
                // Sleep for 0.8 seconds to simulate processing time
                Thread.sleep(800);
            } catch (InterruptedException e) {
                // Exception handling block for thread interruptions
                System.out.println("Calculator Thread: Interrupted!");
            }
        }
    }
}
