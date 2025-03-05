import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

// Deck.java - Represents the deck of cards
public class Deck {
    private ArrayList<Card> deck; // Store deck of cards
    private static final String[] SUITS = {"Hearts", "Diamonds", "Clubs", "Spades"};
    private static final String[] RANKS = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

    // Constructor to create a deck
    public Deck() {
        createDeck();
    }

    // Create deck of 52 cards
    final public void createDeck() {
        deck = new ArrayList<>();
        for (String suit : SUITS) {
            for (String rank : RANKS) {
                deck.add(new Card(suit, rank));
            }
        }
    }

    // Print all cards in deck
    public void printDeck() {
        for (Card card : deck) {
            card.printCard();
        }
    }

    // Find a specific card in the deck
    public Card findCard(String rank, String suit) {
        for (Card card : deck) {
            if (card.getRank().equalsIgnoreCase(rank) && card.getSuit().equalsIgnoreCase(suit)) {
                return card;
            }
        }
        return null;
    }

    // Deal 5 random cards
    public void dealCard() {
        Random rand = new Random();
        System.out.println("Dealing 5 random cards:");
        for (int i = 0; i < 5; i++) {
            int index = rand.nextInt(deck.size());
            deck.get(index).printCard();
        }
    }

    // Shuffle the deck
    public void shuffleDeck() {
        Collections.shuffle(deck);
        System.out.println("Deck shuffled!");
    }
}
    
