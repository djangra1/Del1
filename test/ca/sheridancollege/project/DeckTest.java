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
public class DeckTest {
    
    public DeckTest() {
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
     * Test of draw method, of class Deck.
     */
    @Test
    public void testDraw() {
        System.out.println("draw");
        Deck instance = new Deck();
        Card expResult = null;
        Card result = instance.draw();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of shuffle method, of class Deck.
     */
    @Test
    public void testShuffle() {
        System.out.println("shuffle");
        Deck instance = new Deck();
        instance.shuffle();
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class Deck.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        Deck instance = new Deck();
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class Deck.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        Deck instance = new Deck();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of contains method, of class Deck.
     */
    @Test
    public void testContains() {
        System.out.println("contains");
        Card card = null;
        Deck instance = new Deck();
        boolean expResult = false;
        boolean result = instance.contains(card);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getCards method, of class Deck.
     */
    @Test
    public void testGetCards() {
        System.out.println("getCards");
        Deck instance = new Deck();
        List<Card> expResult = null;
        List<Card> result = instance.getCards();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
