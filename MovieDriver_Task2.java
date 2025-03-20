package Lab1;

import java.util.Scanner;

public class MovieDriver_Task2 {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner keyboard = new Scanner(System.in);
        String continueResponse;

        // Loop for multiple movie entries
        do {
            // Create a new Movie object
            Movie movie = new Movie();

            // Prompt and read the movie title
            System.out.print("Enter the title of the movie: ");
            String title = keyboard.nextLine();
            movie.setTitle(title);

            // Prompt and read the movie rating
            System.out.print("Enter the movie’s rating: ");
            String rating = keyboard.nextLine();
            movie.setRating(rating);

            // Prompt and read the number of tickets sold
            System.out.print("Enter the number of tickets sold at the theater: ");
            int soldTickets = keyboard.nextInt();
            movie.setSoldTickets(soldTickets);
            keyboard.nextLine(); // Consume leftover newline

            // Print out the movie details
            System.out.println("\nMovie Details:");
            System.out.println(movie.toString());

            // Ask the user if they want to continue
            System.out.print("\nDo you want to enter another movie? (yes/no): ");
            continueResponse = keyboard.nextLine();

        } while (continueResponse.equalsIgnoreCase("yes"));

        // Close scanner
        keyboard.close();
        System.out.println("Thank you for using the Movie Database!");
    }
}