import java.util.Scanner;

/**
 * Duck Simulation Program
 * Allows the user to select a duck and observe its behaviors.
 * Behaviors include flying, quacking, and swimming.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Scanner object to take user input

        while (true) {
            // Display the menu options for selecting a duck type
            System.out.println("\n--- Duck Simulation ---");
            System.out.println("1. Mallard Duck");   // Flies, Quacks, Swims
            System.out.println("2. Redhead Duck");   // Flies, Quacks, Swims
            System.out.println("3. Rubber Duck");    // Cannot Fly, Squeaks, Floats
            System.out.println("4. Decoy Duck");     // Cannot Fly, No Quack, Drowns
            System.out.println("5. Exit");          // Exit the program
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();  // Read user input
            Duck duck = null;           // Declare a Duck reference

            // Select a duck based on user choice
            switch (choice) {
                case 1:
                    duck = new MallardDuck();  // Create a MallardDuck object
                    break;
                case 2:
                    duck = new RedheadDuck();  // Create a RedheadDuck object
                    break;
                case 3:
                    duck = new RubberDuck();   // Create a RubberDuck object
                    break;
                case 4:
                    duck = new DecoyDuck();    // Create a DecoyDuck object
                    break;
                case 5:
                    // Exit condition: Close scanner and terminate the program
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
                default:
                    // Handle invalid input
                    System.out.println("Invalid choice! Try again.");
            }

            // If a valid duck is selected, perform its behaviors
            if (duck != null) {
                System.out.println("\n--- Duck Information ---");
                duck.display();       // Display duck type
                duck.performFly();    // Perform flying behavior
                duck.performQuack();  // Perform quacking behavior
                duck.performSwim();   // Perform swimming behavior
            }
        }
    }
}
