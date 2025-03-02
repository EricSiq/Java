import java.util.Scanner;

// DeckOfCards.java - A menu-driven program to manage a deck of playing cards.

public class DeckOfCards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner for user input
        Deck deck = new Deck(); // Create a new deck of cards
        
        while (true) {
            // Display menu options
            System.out.println("\n--- Deck Operations Menu ---");
            System.out.println("1. Print Deck");
            System.out.println("2. Find a Card");
            System.out.println("3. Deal 5 Random Cards");
            System.out.println("4. Shuffle Deck");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            // Ensure valid input
            if (!sc.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number.");
                sc.next(); // Clear the invalid input
                continue;
            }

            int choice = sc.nextInt();
            sc.nextLine(); // Consume the leftover newline character
            
            switch (choice) {
                case 1 -> deck.printDeck(); // Print all cards in the deck
                
                case 2 -> {
                    // Prompt user for rank and suit of the card they want to find
                    System.out.print("Enter rank (e.g., Ace, King, 10): ");
                    String rank = sc.nextLine().trim();
                    
                    System.out.print("Enter suit (e.g., Hearts, Diamonds): ");
                    String suit = sc.nextLine().trim();
                    
                    // Search for the card in the deck
                    if (deck.findCard(rank, suit)) {
                        System.out.println("Card found in deck!");
                    } else {
                        System.out.println("Card not found in deck.");
                    }
                }
                
                case 3 -> deck.dealCard(); // Deal 5 random cards
                
                case 4 -> deck.shuffleDeck(); // Shuffle the deck
                
                case 5 -> {
                    System.out.println("Exiting program. Thank you!");
                    sc.close();
                    System.exit(0);
                }
                
                default -> System.out.println("Invalid choice! Please enter a number between 1 and 5.");
            }
        }
    }
}
