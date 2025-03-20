package Lab1;

import java.util.Scanner;

public class MovieDriver_Task1 {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner keyboard = new Scanner(System.in);

        // Create a Movie object
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

        // Print out the movie details using the toString() method
        System.out.println("\nMovie Details:");
        System.out.println(movie.toString());

        // Close scanner
        keyboard.close();
    }
}