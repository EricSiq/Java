// Card.java - Represents a playing card
public class Card {
    private final String suit;
    private final String rank;

    // Constructor to initialize a card
    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }
    public String getSuit() {
        return suit;
    }
    public String getRank() {
        return rank;
    }
    // Print the card
    public void printCard() {
        System.out.println(rank + " of " + suit);
    }
    // Check if another card has the same suit
    public boolean sameCard(Card other) {
        return this.suit.equals(other.suit);
    }
    // Check if another card has the same rank
    public boolean compareCard(Card other) {
        return this.rank.equals(other.rank);
    }
}
