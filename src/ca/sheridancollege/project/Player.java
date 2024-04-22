package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.List;

/**
 * Models each Player in the game.
 * Players have a name and a hand of cards.
 * Provides methods for managing the player's hand of cards and playing the game.
 * 
 * @author Muhammad Aiz Baloch
 */
public abstract class Player {

    private String name; // the unique name for this player
    private List<Card> hand; // the player's hand of cards

    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<>();
    }

    /**
     * Gets the player's name.
     * 
     * @return the player's name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the player's name.
     * 
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the player's hand of cards.
     * 
     * @return the player's hand of cards
     */
    public List<Card> getHand() {
        return hand;
    }

    /**
     * Sets the player's hand of cards.
     * 
     * @param hand the hand of cards to set
     */
    public void setHand(List<Card> hand) {
        this.hand = hand;
    }

    /**
     * Adds a card to the player's hand.
     * 
     * @param card the card to add
     */
    public void addToHand(Card card) {
        hand.add(card);
    }

    /**
     * Removes a card from the player's hand.
     * 
     * @param card the card to remove
     */
    public void removeFromHand(Card card) {
        hand.remove(card);
    }

    /**
     * Adds a list of cards to the player's hand.
     * 
     * @param cards the list of cards to add
     */
    public void addCards(List<Card> cards) {
        hand.addAll(cards);
    }

    /**
     * The method to be overridden when subclassing the Player class with specific player types.
     * This method should define the logic for a player's turn in the game.
     */
    public abstract void play();
    public abstract Card playCard();
}
