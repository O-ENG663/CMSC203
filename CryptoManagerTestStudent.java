package Assign3;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * This class represents student test cases for a CryptoManager object.
 * These tests are mainly for checking correct functionality in a student environment.
 * 
 * @author [Your Name]
 * @version 7/12/2022
 */
public class CryptoManagerTestStudent {

    @Before
    public void setUp() throws Exception {
        // Setup code if needed before each test
    }

    @After
    public void tearDown() throws Exception {
        // Cleanup code after each test
    }

    @Test
    public void testCaesarEncryption_ValidInput() {
        assertEquals("IFMMP!XPSME", CryptoManager.caesarEncryption("HELLO WORLD", 1));
    }

    @Test
    public void testCaesarEncryption_InvalidInput() {
        assertNotEquals("INVALID", CryptoManager.caesarEncryption("HELLO WORLD", 1));
    }

    @Test
    public void testCaesarDecryption_ValidInput() {
        assertEquals("HELLO WORLD", CryptoManager.caesarDecryption("IFMMP!XPSME", 1));
    }

    @Test
    public void testCaesarDecryption_InvalidInput() {
        assertNotEquals("HELLO WORLD", CryptoManager.caesarDecryption("INVALID TEXT", 1));
    }

    @Test
    public void testBellasoEncryption_ValidInput() {
        String bellasoKey = "KEY";
        assertEquals("RIJVS UYVJN", CryptoManager.bellasoEncryption("HELLO WORLD", bellasoKey));
    }

    @Test
    public void testBellasoDecryption_ValidInput() {
        String bellasoKey = "KEY";
        assertEquals("HELLO WORLD", CryptoManager.bellasoDecryption("RIJVS UYVJN", bellasoKey));
    }

    @Test
    public void testBellasoEncryption_InvalidInput() {
        String bellasoKey = "KEY";
        assertNotEquals("HELLO WORLD", CryptoManager.bellasoEncryption("HELLO WORLD", bellasoKey));
    }

    @Test
    public void testIsStringInBounds_Valid() {
        assertTrue(CryptoManager.isStringInBounds("VALID STRING"));
    }

    @Test
    public void testIsStringInBounds_Invalid() {
        assertFalse(CryptoManager.isStringInBounds("INVALID STRING!@#"));
    }
}