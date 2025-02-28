import java.util.Scanner;

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

// Rectangle class extends Shape
class Rectangle extends Shape {
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
        System.out.print("Enter the width of the rectangle: ");
        double width = sc.nextDouble();
        return new Rectangle(length, width);
    }
}

