import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        System.out.println("Name: [Your Name] | PRN: [Your PRN] | Batch: [Your Batch]");
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Square");
            System.out.println("4. Sphere");
            System.out.println("5. Cylinder");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            Shape shape = null;
            Volume volumeShape = null;

            switch (choice) {
                case 1:
                    shape = Circle.createFromUserInput();
                    break;
                case 2:
                    shape = Rectangle.createFromUserInput();
                    break;
                case 3:
                    shape = Square.createFromUserInput();
                    break;
                case 4:
                    volumeShape = Sphere.createFromUserInput();
                    shape = (Shape) volumeShape;
                    break;
                case 5:
                    volumeShape = Cylinder.createFromUserInput();
                    shape = (Shape) volumeShape;
                    break;
                case 6:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Try again.");
            }

            if (shape != null) {
                System.out.println("Area: " + shape.calculateArea());
                System.out.println("Perimeter: " + shape.calculatePerimeter());
            }
            if (volumeShape != null) {
                System.out.println("Volume: " + volumeShape.calculateVolume());
            }
        }
    }
}
