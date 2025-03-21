package Assign3;

/**
 * CryptoManager class that provides methods for encryption and decryption
 * using Caesar and Bellaso Ciphers.
 *
 * Class: CMSC203
 * Instructor: [Your Instructor's Name]
 * Description: Implements encryption and decryption methods for two cipher techniques.
 * Due: [Due Date]
 * Platform/compiler: Eclipse
 * 
 * I pledge that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * I have not given my code to any student.
 * Print your Name here: Ange Stephy Ongoue Wetomdie
 */

public class CryptoManager {

    private static final char LOWER_RANGE = ' ';
    private static final char UPPER_RANGE = '_';
    private static final int RANGE = UPPER_RANGE - LOWER_RANGE + 1;

    /**
     * Determines if a string is within the allowable ASCII bounds.
     * 
     * @param plainText The string to be checked.
     * @return True if all characters are within the allowable bounds, false otherwise.
     */
    public static boolean isStringInBounds(String plainText) {
        for (char ch : plainText.toCharArray()) {
            if (ch < LOWER_RANGE || ch > UPPER_RANGE) {
                return false;
            }
        }
        return true;
    }

    /**
     * Encrypts a string using the Caesar Cipher.
     * 
     * @param plainText The uppercase string to be encrypted.
     * @param key The offset key for shifting characters.
     * @return The encrypted string, or an error message if the string is out of bounds.
     */
    public static String caesarEncryption(String plainText, int key) {
        if (!isStringInBounds(plainText)) {
            return "The selected string is not in bounds, Try again.";
        }

        StringBuilder encryptedText = new StringBuilder();
        key = key % RANGE; // Ensure key is within bounds

        for (char ch : plainText.toCharArray()) {
            char encryptedChar = (char) (ch + key);
            while (encryptedChar > UPPER_RANGE) {
                encryptedChar -= RANGE;
            }
            encryptedText.append(encryptedChar);
        }
        return encryptedText.toString();
    }

    /**
     * Decrypts a string encrypted using the Caesar Cipher.
     * 
     * @param encryptedText The encrypted string.
     * @param key The offset key used for encryption.
     * @return The decrypted plain text string.
     */
    public static String caesarDecryption(String encryptedText, int key) {
        StringBuilder decryptedText = new StringBuilder();
        key = key % RANGE; // Ensure key is within bounds

        for (char ch : encryptedText.toCharArray()) {
            char decryptedChar = (char) (ch - key);
            while (decryptedChar < LOWER_RANGE) {
                decryptedChar += RANGE;
            }
            decryptedText.append(decryptedChar);
        }
        return decryptedText.toString();
    }

    /**
     * Encrypts a string using the Bellaso Cipher.
     * 
     * @param plainText The string to be encrypted.
     * @param bellasoStr The key string used for encryption.
     * @return The encrypted string, or an error message if the string is out of bounds.
     */
    public static String bellasoEncryption(String plainText, String bellasoStr) {
        if (!isStringInBounds(plainText)) {
            return "The selected string is not in bounds, Try again.";
        }

        StringBuilder encryptedText = new StringBuilder();
        int bellasoStrLen = bellasoStr.length();

        for (int i = 0; i < plainText.length(); i++) {
            char ch = plainText.charAt(i);
            char keyChar = bellasoStr.charAt(i % bellasoStrLen);
            char encryptedChar = (char) (ch + keyChar);
            while (encryptedChar > UPPER_RANGE) {
                encryptedChar -= RANGE;
            }
            encryptedText.append(encryptedChar);
        }
        return encryptedText.toString();
    }

    /**
     * Decrypts a string encrypted using the Bellaso Cipher.
     * 
     * @param encryptedText The encrypted string.
     * @param bellasoStr The key string used for encryption.
     * @return The decrypted plain text string.
     */
    public static String bellasoDecryption(String encryptedText, String bellasoStr) {
        StringBuilder decryptedText = new StringBuilder();
        int bellasoStrLen = bellasoStr.length();

        for (int i = 0; i < encryptedText.length(); i++) {
            char ch = encryptedText.charAt(i);
            char keyChar = bellasoStr.charAt(i % bellasoStrLen);
            char decryptedChar = (char) (ch - keyChar);
            while (decryptedChar < LOWER_RANGE) {
                decryptedChar += RANGE;
            }
            decryptedText.append(decryptedChar);
        }
        return decryptedText.toString();
    }
}