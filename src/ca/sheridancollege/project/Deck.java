package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * A class representing a deck of cards. This class manages a deck of cards and provides methods for manipulation.
 *
 * @author Deepika
 */
public class Deck {

    private List<Card> cards;

    public Deck() {
        initializeDeck();
    }

    private void initializeDeck() {
        cards = new ArrayList<>();
        for (Rank rank : Rank.values()) {
            for (Suit suit : Suit.values()) {
                cards.add(new Card(rank, suit));
            }
        }
    }

    public Card draw() {
        if (!isEmpty()) {
            return cards.remove(0);
        }
        return null;
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public boolean isEmpty() {
        return cards.isEmpty();
    }

    public int size() {
        return cards.size();
    }

    public boolean contains(Card card) {
        return cards.contains(card);
    }

    public List<Card> getCards() {
        return cards;
    }
}
