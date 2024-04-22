package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * A concrete implementation of the Game class representing the game of War. This class provides the specific logic for
 * playing the game of War.
 */
public class WarGame extends Game {

    private static final int INITIAL_HAND_SIZE = 26;
    private final Deck deck;

    /**
     * Constructs a new instance of WarGame.
     */
    public WarGame() {
        super("War");
        this.deck = new Deck();
    }

    /**
     * Registers a player for the game.
     *
     * @param playerName The name of the player to register.
     */
    public void registerPlayer(String playerName) {
        WarPlayer player = new WarPlayer(playerName);
        getPlayers().add(player);
    }

    @Override
    public void play() {
        System.out.println("Game of War begins!");

        // Display registered players' names
        System.out.println("Registered Players:");
        for (Player player : getPlayers()) {
            System.out.println("- " + player.getName());
        }
        System.out.println();

        // Shuffle the deck
        System.out.println("Shuffling the deck...");
        deck.shuffle();
        System.out.println("Deck shuffled successfully.");
        System.out.println();

        // Deal cards to players
        System.out.println("Dealing cards to players...");
        for (Player player : getPlayers()) {
            dealCards(player);
            System.out.println(player.getName() + " has been dealt " + INITIAL_HAND_SIZE + " cards.");
        }
        System.out.println();

        // Start playing the game
        while (true) {
            List<Player> activePlayers = new ArrayList<>();
            for (Player player : getPlayers()) {
                if (!player.getHand().isEmpty()) {
                    activePlayers.add(player);
                }
            }
            if (activePlayers.size() < 2) {
                break;
            }
            playRound(activePlayers);
        }

        // Display scoreboard
        System.out.println("Scoreboard:");
        declareWinner();
    }

    @Override
public void declareWinner() {
    int maxScore = 0;
    List<Player> winners = new ArrayList<>();

    // Find the maximum score among the players
    for (Player player : getPlayers()) {
        int playerScore = player.getHand().size();
        if (playerScore > maxScore) {
            maxScore = playerScore;
            winners.clear();
            winners.add(player);
        } else if (playerScore == maxScore) {
            winners.add(player);
        }
    }

    // Display scores of both players
    for (Player player : getPlayers()) {
        System.out.println(player.getName() + " has " + player.getHand().size() + " cards.");
    }

    // Declare the winner(s)
    if (winners.size() == 1) {
        System.out.println(winners.get(0).getName() + " wins the game with " + maxScore + " cards!");
    } else {
        System.out.println("It's a tie between:");
        for (Player winner : winners) {
            System.out.println("- " + winner.getName());
        }
        System.out.println("Each player has " + maxScore + " cards.");
    }
}

    // Method to deal cards to a player
    private void dealCards(Player player) {
        for (int i = 0; i < INITIAL_HAND_SIZE; i++) {
            Card drawnCard = deck.draw();
            if (drawnCard != null) {
                player.addToHand(drawnCard);
            } else {
                System.out.println("Deck is empty. Unable to deal more cards.");
                break;
            }
        }
    }

    // Method to play a round of the game
    private void playRound(List<Player> players) {
        List<Card> cardsInPlay = new ArrayList<>();
        for (Player player : players) {
            Card card = player.playCard();
            if (card != null) {
                cardsInPlay.add(card);
                System.out.println(player.getName() + " plays: " + card);
            }
        }
        if (!cardsInPlay.isEmpty()) {
            Card highestCard = findHighestCard(cardsInPlay);
            List<Player> winners = findWinners(players, cardsInPlay, highestCard);
            for (Player winner : winners) {
                winner.addCards(cardsInPlay);
            }
        }
    }

    // Method to find the highest card among the cards in play
    private Card findHighestCard(List<Card> cards) {
        Card highestCard = cards.get(0);
        for (Card card : cards) {
            if (card.getRank().getValue() > highestCard.getRank().getValue()) {
                highestCard = card;
            }
        }
        return highestCard;
    }

    // Method to find the winners among the players based on the highest card
    private List<Player> findWinners(List<Player> players, List<Card> cards, Card highestCard) {
        List<Player> winners = new ArrayList<>();
        for (Player player : players) {
            if (!player.getHand().isEmpty() && player.getHand().get(0).getRank() == highestCard.getRank()) {
                winners.add(player);
            }
        }
        return winners;
    }
}
