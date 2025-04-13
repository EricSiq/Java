// Class to perform division operation.
public class Division {
    
    /**
     * Divides the dividend by the divisor.
     *
     * @param dividend The number to be divided.
     * @param divisor  The number to divide by.
     * @return Result of the division.
     * @throws ArithmeticException if divisor is zero.
     */
    public static double divide(double dividend, double divisor) {
        if (divisor == 0) {
            // Throw an ArithmeticException for division by zero.
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return dividend / divisor;
    }
}
