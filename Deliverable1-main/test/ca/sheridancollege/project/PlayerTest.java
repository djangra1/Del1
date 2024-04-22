/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ca.sheridancollege.project;

import java.util.List;
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
public class PlayerTest {
    
    public PlayerTest() {
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
     * Test of getName method, of class Player.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Player instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Player.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Player instance = null;
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getHand method, of class Player.
     */
    @Test
    public void testGetHand() {
        System.out.println("getHand");
        Player instance = null;
        List<Card> expResult = null;
        List<Card> result = instance.getHand();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setHand method, of class Player.
     */
    @Test
    public void testSetHand() {
        System.out.println("setHand");
        List<Card> hand = null;
        Player instance = null;
        instance.setHand(hand);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addToHand method, of class Player.
     */
    @Test
    public void testAddToHand() {
        System.out.println("addToHand");
        Card card = null;
        Player instance = null;
        instance.addToHand(card);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of removeFromHand method, of class Player.
     */
    @Test
    public void testRemoveFromHand() {
        System.out.println("removeFromHand");
        Card card = null;
        Player instance = null;
        instance.removeFromHand(card);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of addCards method, of class Player.
     */
    @Test
    public void testAddCards() {
        System.out.println("addCards");
        List<Card> cards = null;
        Player instance = null;
        instance.addCards(cards);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of play method, of class Player.
     */
    @Test
    public void testPlay() {
        System.out.println("play");
        Player instance = null;
        instance.play();
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of playCard method, of class Player.
     */
    @Test
    public void testPlayCard() {
        System.out.println("playCard");
        Player instance = null;
        Card expResult = null;
        Card result = instance.playCard();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

}