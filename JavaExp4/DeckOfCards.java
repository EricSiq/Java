import java.util.Scanner;

// DeckOfCards.java - Main class to handle menu-driven program
public class DeckOfCards {
    public static void main(String[] args) {
        // Header
        System.out.println("Name: [Your Name] | PRN: [Your PRN] | Batch: [Your Batch]");
        
        Scanner sc = new Scanner(System.in);
        Deck deck = new Deck();
        
        while (true) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Print Deck");
            System.out.println("2. Find a Card");
            System.out.println("3. Deal 5 Random Cards");
            System.out.println("4. Shuffle Deck");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline
            
            switch (choice) {
                case 1:
                    deck.printDeck();
                    break;
                case 2:
                    System.out.print("Enter rank (e.g., Ace, King, 10): ");
                    String rank = sc.nextLine();
                    System.out.print("Enter suit (e.g., Hearts, Diamonds): ");
                    String suit = sc.nextLine();
                    if (deck.findCard(rank, suit)) {
                        System.out.println("Card found in deck!");
                    } else {
                        System.out.println("Card not found.");
                    }
                    break;
                case 3:
                    deck.dealCard();
                    break;
                case 4:
                    deck.shuffleDeck();
                    break;
                case 5:
                    System.out.println("Exiting program.");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
