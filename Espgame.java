package Ass1;

import java.util.Scanner;
import java.util.Random;

public class Espgame {

    public static void main(String[] args) {
        final String[] COLORS = {
            "Black", "White", "Gray", "Silver", "Maroon", "Red", "Purple", "Fuchsia", 
            "Green", "Lime", "Olive", "Yellow", "Navy", "Blue", "Teal", "Aqua"
        };

        final int T_ATTEMPTS = 11;

        int cGuesses = 0;

        Scanner scan2 = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scan2.nextLine();

        System.out.print("Enter your MC M#: ");
        String mNumber = scan2.nextLine();

        System.out.print("Describe yourself: ");
        String Description = scan2.nextLine();

        System.out.print("Enter due date (MM/DD/YY): ");
        String dueDate = scan2.nextLine();

        Random random = new Random();

        for (int i = 1; i < T_ATTEMPTS; i++) {
            System.out.println("\nRound " + i);
            System.out.println("I am thinking of a color.");
            System.out.println("Is it one of the following colors?");
            for (int j = 0; j < 16; j++) {
                System.out.print((j + 1) + " " + COLORS[j] + "  ");
            }
            System.out.println("\nEnter your guess: ");
            String userGuess = scan2.nextLine();

            int randomIndex = random.nextInt(16);
            String selColor = COLORS[randomIndex];

            while (!isValidColor(userGuess, COLORS)) {
                System.out.println("You entered an invalid color. Please choose from the list.");
                userGuess = scan2.nextLine();
            }

            if (userGuess.equalsIgnoreCase(selColor)) {
                System.out.println("\nI was thinking of " + selColor + ".");
                cGuesses++;
            } else {
                System.out.println("\nI was thinking of " + selColor + ".");
            }
        }

        System.out.println("\nGame over\n\n");
        System.out.println("You guessed " + cGuesses + " out of " + T_ATTEMPTS);
        System.out.println("Student name: " + name);
        System.out.println("User Description: " + Description);
        System.out.println("Due date: " + dueDate);
    }

    // Helper method to check if the user's guess is a valid color
    public static boolean isValidColor(String userGuess, String[] colors) {
        for (String color : colors) {
            if (userGuess.equalsIgnoreCase(color)) {
                return true;
            }
        }
        return false;
    }
}