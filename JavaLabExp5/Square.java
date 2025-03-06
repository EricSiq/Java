import java.util.Scanner;

// Square class extends Shape
public class Square extends Shape {
    private final double side;

    // Constructor
    public Square(double side) {
        super("Square");
        this.side = side;
    }

    // Override abstract methods
    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }

    // Static method to create a Square from user input
    public static Square createFromUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side length of the square: ");
        double side = sc.nextDouble();
        return new Square(side);
    }
}
