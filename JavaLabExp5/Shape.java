import java.util.Scanner;

// Abstract class Shape for common shape properties
abstract class Shape {
    protected String shapeName;

    // Constructor
    public Shape(String shape) {
        this.shapeName = shape;
    }

    // Abstract methods to be implemented by child classes
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}

// Circle class extends Shape
class Circle extends Shape {
    private final double radius;

    // Constructor
    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    // Override abstract methods
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    // Static method to create a Circle from user input
    public static Circle createFromUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();
        return new Circle(radius);
    }
}

// Interface Volume for 3D shapes
interface Volume {
    double calculateVolume();
}

