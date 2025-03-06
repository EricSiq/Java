import java.util.Scanner;
// Eric Siqueira
// AIML A2
// PRN: 23070126041
// Menu-driven program for calculating area, perimeter, and volume of different shapes.
public class Main {
    public static void main(String[] args) {        
        Scanner sc = new Scanner(System.in); // Scanner for user input
        
        while (true) {
            // Display the menu options
            System.out.println("\n--- Shape Selection Menu ---");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Square");
            System.out.println("4. Sphere");
            System.out.println("5. Cylinder");
            System.out.println("6. Equilateral Pyramid");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            // Validate user input
            if (!sc.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number.");
                sc.next(); // Clear the invalid input
                continue;
            }

            int choice = sc.nextInt();
            Shape shape = null;         // To hold the shape object for area and perimeter calculations
            Volume volumeShape = null;    // To hold the shape object for volume calculation

            // Process user choice using a switch-case block
            switch (choice) {
                case 1 -> shape = Circle.createFromUserInput();
                case 2 -> shape = Rectangle.createFromUserInput();
                case 3 -> shape = Square.createFromUserInput();
                case 4 -> {
                    volumeShape = Sphere.createFromUserInput();
                    shape = (Shape) volumeShape; // Cast Sphere to Shape
                }
                case 5 -> {
                    volumeShape = Cylinder.createFromUserInput();
                    shape = (Shape) volumeShape; // Cast Cylinder to Shape
                }
                case 6 -> {
                    volumeShape = Pyramid.createFromUserInput();
                    shape = (Shape) volumeShape; // Cast Pyramid to Shape
                }
                case 7 -> {
                    System.out.println("Exiting... Thank you!");
                    sc.close();
                    System.exit(0);
                }
                default -> System.out.println("Invalid choice! Please enter a valid option.");
            }

            // Display area and perimeter if a shape is selected
            if (shape != null) {
                System.out.println("\n--- Calculations ---");
                System.out.println("Area: " + shape.calculateArea());
                System.out.println("Perimeter: " + shape.calculatePerimeter());
            }
            
            // Display volume if a 3D shape (implements Volume) is selected
            if (volumeShape != null) {
                System.out.println("Volume: " + volumeShape.calculateVolume());
            }
        }
    }
}
