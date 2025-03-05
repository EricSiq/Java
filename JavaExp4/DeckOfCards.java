//Eric Siqueira
//PRN : 23070126041
// AIML A2
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
            System.out.println("5. Compare Two Cards (Same Suit?)");
            System.out.println("6. Compare Two Cards (Same Rank?)");
            System.out.println("7. Exit");
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
                    Card foundCard = deck.findCard(rank, suit);
                    if (foundCard != null) {
                        System.out.println("Card found: ");
                        foundCard.printCard();
                    } else {
                        System.out.println("Card not found in deck.");
                    }
                }

                case 3 -> deck.dealCard(); // Deal 5 random cards

                case 4 -> deck.shuffleDeck(); // Shuffle the deck

                case 5, 6 -> {
                    // Select two cards for comparison
                    System.out.print("Enter rank of first card: ");
                    String rank1 = sc.nextLine().trim();
                    System.out.print("Enter suit of first card: ");
                    String suit1 = sc.nextLine().trim();
                    Card card1 = deck.findCard(rank1, suit1);

                    System.out.print("Enter rank of second card: ");
                    String rank2 = sc.nextLine().trim();
                    System.out.print("Enter suit of second card: ");
                    String suit2 = sc.nextLine().trim();
                    Card card2 = deck.findCard(rank2, suit2);

                    // Ensure both cards exist in the deck
                    if (card1 == null || card2 == null) {
                        System.out.println("One or both cards not found in the deck.");
                    } else {
                        if (choice == 5) {
                            // Check if same suit
                            System.out.println("Comparing if both cards have the same suit...");
                            System.out.println(card1.sameCard(card2) ? "Both cards have the same suit!" : "Cards have different suits.");
                        } else {
                            // Check if same rank
                            System.out.println("Comparing if both cards have the same rank...");
                            System.out.println(card1.compareCard(card2) ? "Both cards have the same rank!" : "Cards have different ranks.");
                        }
                    }
                }

                case 7 -> {
                    System.out.println("Exiting program. Thank you!");
                    sc.close();
                    System.exit(0);
                }

                default -> System.out.println("Invalid choice! Please enter a number between 1 and 7.");
            }
        }
    }
}
