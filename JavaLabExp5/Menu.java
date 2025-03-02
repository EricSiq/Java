import java.util.Scanner;

// Menu-driven program for calculating area, perimeter, and volume of different shapes.

public class Menu {
    public static void main(String[] args) {
        // Display student details
        System.out.println("Name: [Your Name] | PRN: [Your PRN] | Batch: [Your Batch]");
        
        Scanner sc = new Scanner(System.in); // Scanner for user input
        
        while (true) {
            // Display the menu options
            System.out.println("\n--- Shape Selection Menu ---");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Square");
            System.out.println("4. Sphere");
            System.out.println("5. Cylinder");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            // Handle user input safely
            if (!sc.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number.");
                sc.next(); // Clear the invalid input
                continue;
            }

            int choice = sc.nextInt();
            Shape shape = null;  // Stores shape object for area and perimeter calculations
            Volume volumeShape = null; // Stores volume shape object for volume calculations

            // Process user choice
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

            // Display volume if a 3D shape is selected
            if (volumeShape != null) {
                System.out.println("Volume: " + volumeShape.calculateVolume());
            }
        }
    }
}
