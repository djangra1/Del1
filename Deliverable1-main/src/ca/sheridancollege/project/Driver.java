/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

/**
 *
 * @author hp
 */
public class Driver {

    public static void main(String[] args) {
        // Create a new instance of the WarGame class and start the game
        WarGame warGame = new WarGame();
        warGame.registerPlayer("Player 1");
        warGame.registerPlayer("Player 2");
        warGame.play();

    }
}
