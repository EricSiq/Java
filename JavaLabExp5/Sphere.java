import java.util.Scanner;

// Sphere class extends Shape and implements Volume
class Sphere extends Shape implements Volume {
    private final double radius;

    // Constructor
    public Sphere(double radius) {
        super("Sphere");
        this.radius = radius;
    }

    // Override abstract methods
    @Override
    public double calculateArea() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 0; // Not applicable for a sphere
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
