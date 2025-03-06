import java.util.Scanner;

// Sphere class extends Shape and implements Volume
public class Sphere extends Shape implements Volume {
    private final double radius;

    // Constructor
    public Sphere(double radius) {
        super("Sphere");
        this.radius = radius;
    }

    // Override abstract methods
    @Override
    public double calculateArea() {
        // Projected area (area of great circle)
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        // Total surface area of sphere
        return 4 * Math.PI * radius * radius;
    }

    @Override
    public double calculateVolume() {
        return (4.0 / 3) * Math.PI * Math.pow(radius, 3);
    }

    // Static method to create a Sphere from user input
    public static Sphere createFromUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of the sphere: ");
        double radius = sc.nextDouble();
        return new Sphere(radius);
    }
}
