// Class to calculate the square root of a number.
public class SquareRoot {
    
    /**
     * Returns the square root of the given number.
     *
     * @param a The number to find the square root of.
     * @return Square root of a.
     * @throws ArithmeticException if a is negative.
     */
    public static double squareRoot(double a) {
        if (a < 0) {
            // Throw an ArithmeticException for negative inputs.
            throw new ArithmeticException("Square root of a negative number is not allowed.");
        }
        return Math.sqrt(a);
    }
}
