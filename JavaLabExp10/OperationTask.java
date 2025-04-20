// OperationTask.java
public class OperationTask implements Runnable {
    private final double a;
    private final double b;
    private final int operation;

    public OperationTask(double a, double b, int operation) {
        this.a = a;
        this.b = b;
        this.operation = operation;
    }

    @Override
    public void run() {
        switch (operation) {
            case 1 -> {
                double result = a + b;
                System.out.println("Operation Thread: Sum = " + result);
            }
            case 2 -> {
                double result = a - b;
                System.out.println("Operation Thread: Difference = " + result);
            }
            case 3 -> {
                double result = a * b;
                System.out.println("Operation Thread: Product = " + result);
            }
            case 4 -> {
                if (b != 0) {
                    double result = a / b;
                    System.out.println("Operation Thread: Quotient = " + result);
                } else {
                    System.out.println("Operation Thread: Cannot divide by zero!");
                }
            }
            default -> System.out.println("Operation Thread: Invalid operation selected.");
        }
    }
}
