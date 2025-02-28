import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Duck Simulation ---");
            System.out.println("1. Mallard Duck");
            System.out.println("2. Redhead Duck");
            System.out.println("3. Rubber Duck");
            System.out.println("4. Decoy Duck");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            Duck duck = null;

            switch (choice) {
                case 1:
                    duck = new MallardDuck();
                    break;
                case 2:
                    duck = new RedheadDuck();
                    break;
                case 3:
                    duck = new RubberDuck();
                    break;
                case 4:
                    duck = new DecoyDuck();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Try again.");
            }

            if (duck != null) {
                duck.display();
                duck.performFly();
                duck.performQuack();
                duck.performSwim();
            }
        }
    }
}
