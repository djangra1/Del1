/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

import java.util.List;

/**
 *
 * @author hp
 */
public class WarPlayer extends Player {
    
    public WarPlayer(String name) {
        super(name);
    }

    public Card playCard() {
    if (!getHand().isEmpty()) {
        return getHand().remove(0);
    } else {
        System.out.println("Player's hand is empty. Cannot play a card.");
        return null;
    }
}
    
    @Override
    public void play() {
        // Implement the logic for a player's turn in the game of War
    }
}
