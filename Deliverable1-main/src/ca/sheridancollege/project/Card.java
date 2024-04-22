package ca.sheridancollege.project;

/**
 * A class representing a playing card for the game of War.
 * Each card has a rank and a suit.
 * 
 * @author Muhammad Aiz Baloch
 */
public class Card extends Object {
    // Properties
    private Rank rank; // Rank of the card
    private Suit suit; // Suit of the card

    // Constructor
    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }
    // Getters and Setters

      /**
     * Gets the rank of the card.
     * 
     * @return The rank of the card.
     */

    public Rank getRank() {
        return rank;
    }
      
        /**
     * Gets the suit of the card.
     * 
     * @return The suit of the card.
     */

    public Suit getSuit() {
        return suit;
    }


     
    // Override toString method to provide a meaningful representation of a card

      /**
     * Returns a string representation of the card.
     * 
     * @return A string representation of the card, including its rank and suit.
     */

    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}
