import java.util.Scanner;

// For an equilateral pyramid (all edges equal), if the base side is 's',
public class Pyramid extends Shape implements Volume {
    private final double side;
    private final double height; // Computed based on equilateral property

    // Constructor: height is computed automatically from the side length.
    public Pyramid(double side) {
        super("Pyramid: ");
        this.side = side;
        this.height = side / Math.sqrt(2);
    }

    // Calculate total surface area (base area + lateral area)
    @Override
    public double calculateArea() {
        // Calculate slant height L
        double slantHeight = Math.sqrt(height * height + (side / 2) * (side / 2));
        // Lateral area = 4 * (1/2 * side * slantHeight) = 2 * side * slantHeight
        double lateralArea = 2 * side * slantHeight;
        // Total surface area = base area + lateral area
        return (side * side) + lateralArea;
    }
    // Return the perimeter of the base
    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }

    // Calculate volume using the formula: (1/3) * base area * height
    @Override
    public double calculateVolume() {
        return (side * side * height) / 3;
    }

    // Static method to create an Pyramid object from user input
    public static Pyramid createFromUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side length of the pyramid's base: ");
        double side = sc.nextDouble();
        return new Pyramid(side);
    }
}
