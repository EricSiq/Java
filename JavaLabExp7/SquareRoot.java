// Class to calculate the square root of a number.
public class SquareRoot {
    
    /**
     * Returns the square root of the given number.
     *
     * @param a The number to find square root of.
     * @return Square root of a.
     * @throws ArithmeticException if the number is negative.
     */
    public static double squareRoot(double a) {
        if (a < 0) {
            throw new ArithmeticException("Cannot calculate square root of a negative number.");
        }
        return Math.sqrt(a);
    }
}
