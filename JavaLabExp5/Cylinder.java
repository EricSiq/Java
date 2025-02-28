import java.util.Scanner;

interface Volume {
    double calculateVolume();
}

// Cylinder class extends Shape and implements Volume
class Cylinder extends Shape implements Volume {
    private final double radius;
    private final double height;

    // Constructor
    public Cylinder(double radius, double height) {
        super("Cylinder");
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius; // Circumference of base
    }

    @Override
    public double calculateVolume() {
        return Math.PI * radius * radius * height;
    }

    // Static method to create a Cylinder from user input
    public static Cylinder createFromUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of the cylinder: ");
        double radius = sc.nextDouble();
        System.out.print("Enter height of the cylinder: ");
        double height = sc.nextDouble();
        return new Cylinder(radius, height);
    }
}
