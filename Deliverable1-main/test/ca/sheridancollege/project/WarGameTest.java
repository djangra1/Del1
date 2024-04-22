/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ca.sheridancollege.project;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author hp
 */
public class WarGameTest {
    
    public WarGameTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of registerPlayer method, of class WarGame.
     */
    @Test
    public void testRegisterPlayer() {
        System.out.println("registerPlayer");
        String playerName = "";
        WarGame instance = new WarGame();
        instance.registerPlayer(playerName);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of play method, of class WarGame.
     */
    @Test
    public void testPlay() {
        System.out.println("play");
        WarGame instance = new WarGame();
        instance.play();
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of declareWinner method, of class WarGame.
     */
    @Test
    public void testDeclareWinner() {
        System.out.println("declareWinner");
        WarGame instance = new WarGame();
        instance.declareWinner();
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
    // Good Test: Verify player registration
    @Test
    public void testPlayerRegistration() {
        WarGame game = new WarGame();
        game.registerPlayer("Player 1");
        game.registerPlayer("Player 2");
        assertEquals(2, game.getPlayers().size());
        assertEquals("Player 1", game.getPlayers().get(0).getName());
        assertEquals("Player 2", game.getPlayers().get(1).getName());
    }

}