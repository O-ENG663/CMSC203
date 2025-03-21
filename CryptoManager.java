package Assign3;

public class CryptoManager {
    
    // Constant for valid range of characters (A-Z and a-z)
    private static final int LOWER_RANGE = 65;  // 'A'
    private static final int UPPER_RANGE = 122; // 'z'

    // Method to check if a string contains valid characters (within the acceptable range)
    public static boolean isStringInBounds(String plaintext) {
        for (int i = 0; i < plaintext.length(); i++) {
            char c = plaintext.charAt(i);
            if (c < LOWER_RANGE || (c > 'Z' && c < 'a') || c > UPPER_RANGE) {
                return false; // Invalid character found
            }
        }
        return true; // All characters are valid
    }

    // Caesar Cipher Encryption
    public static String caesarEncryption(String plaintext, int key) {
        if (!isStringInBounds(plaintext)) {
            return "The selected string is not in bounds, Try again.";
        }

        StringBuilder encryptedText = new StringBuilder();
        for (int i = 0; i < plaintext.length(); i++) {
            char c = plaintext.charAt(i);
            int encryptedChar = c + key;

            // Adjust for range
            if (c >= 'A' && c <= 'Z') {
                encryptedChar = ((encryptedChar - 'A') % 26 + 26) % 26 + 'A';
            } else if (c >= 'a' && c <= 'z') {
                encryptedChar = ((encryptedChar - 'a') % 26 + 26) % 26 + 'a';
            }

            encryptedText.append((char) encryptedChar);
        }

        return encryptedText.toString();
    }

    // Bellaso Cipher Encryption
    public static String bellasoEncryption(String plaintext, String bellasoStr) {
        if (!isStringInBounds(plaintext)) {
            return "The selected string is not in bounds, Try again.";
        }

        StringBuilder encryptedText = new StringBuilder();
        int bellasoIndex = 0;

        for (int i = 0; i < plaintext.length(); i++) {
            char c = plaintext.charAt(i);
            char bellasoChar = bellasoStr.charAt(bellasoIndex % bellasoStr.length());

            // Encrypt each character
            int encryptedChar = c + bellasoChar;

            // Adjust for range
            if (c >= 'A' && c <= 'Z') {
                encryptedChar = ((encryptedChar - 'A') % 26 + 26) % 26 + 'A';
            } else if (c >= 'a' && c <= 'z') {
                encryptedChar = ((encryptedChar - 'a') % 26 + 26) % 26 + 'a';
            }

            encryptedText.append((char) encryptedChar);
            bellasoIndex++;
        }

        return encryptedText.toString();
    }

    // Caesar Cipher Decryption
    public static String caesarDecryption(String encryptedText, int key) {
        StringBuilder decryptedText = new StringBuilder();
        for (int i = 0; i < encryptedText.length(); i++) {
            char c = encryptedText.charAt(i);
            int decryptedChar = c - key;

            // Adjust for range
            if (c >= 'A' && c <= 'Z') {
                decryptedChar = ((decryptedChar - 'A') % 26 + 26) % 26 + 'A';
            } else if (c >= 'a' && c <= 'z') {
                decryptedChar = ((decryptedChar - 'a') % 26 + 26) % 26 + 'a';
            }

            decryptedText.append((char) decryptedChar);
        }

        return decryptedText.toString();
    }

    // Bellaso Cipher Decryption
    public static String bellasoDecryption(String encryptedText, String bellasoStr) {
        StringBuilder decryptedText = new StringBuilder();
        int bellasoIndex = 0;

        for (int i = 0; i < encryptedText.length(); i++) {
            char c = encryptedText.charAt(i);
            char bellasoChar = bellasoStr.charAt(bellasoIndex % bellasoStr.length());

            // Decrypt each character
            int decryptedChar = c - bellasoChar;

            // Adjust for range
            if (c >= 'A' && c <= 'Z') {
                decryptedChar = ((decryptedChar - 'A') % 26 + 26) % 26 + 'A';
            } else if (c >= 'a' && c <= 'z') {
                decryptedChar = ((decryptedChar - 'a') % 26 + 26) % 26 + 'a';
            }

            decryptedText.append((char) decryptedChar);
            bellasoIndex++;
        }

        return decryptedText.toString();
    }

    public static void main(String[] args) {
        // Sample inputs for encryption and decryption
        String plaintext = "MERRY CHRISTMAS";
        int caesarKey = 5;
        String bellasoStr = "HELLO";

        // Caesar Cipher encryption and decryption
        String caesarEncrypted = caesarEncryption(plaintext, caesarKey);
        System.out.println("Caesar Encrypted: " + caesarEncrypted);
        String caesarDecrypted = caesarDecryption(caesarEncrypted, caesarKey);
        System.out.println("Caesar Decrypted: " + caesarDecrypted);

        // Bellaso Cipher encryption and decryption
        String bellasoEncrypted = bellasoEncryption(plaintext, bellasoStr);
        System.out.println("Bellaso Encrypted: " + bellasoEncrypted);
        String bellasoDecrypted = bellasoDecryption(bellasoEncrypted, bellasoStr);
        System.out.println("Bellaso Decrypted: " + bellasoDecrypted);
    }
}
