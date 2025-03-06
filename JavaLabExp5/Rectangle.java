import java.util.Scanner;

// Rectangle class extends Shape
public class Rectangle extends Shape {
    private final double length;
    private final double width;
    
    // Constructor
    public Rectangle(double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    // Override abstract methods
    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    // Static method to create a Rectangle from user input
    public static Rectangle createFromUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter width of the rectangle: ");
        double width = sc.nextDouble();
        return new Rectangle(length, width);
    }
}
