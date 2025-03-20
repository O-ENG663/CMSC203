package Lab1;

public class Movie {

    private String title;
    private String rating;
    private int soldTickets;

    // Default Constructor
    public Movie() {
        title = "";
        rating = "";
        soldTickets = 0;
    }

    // Copy Constructor
    public Movie(Movie m) {
        title = m.title;
        rating = m.rating;
        soldTickets = m.soldTickets;
    }

    // Parameterized Constructor
    public Movie(String title, String rating, int soldTickets) {
        this.title = title;
        this.rating = rating;
        this.soldTickets = soldTickets;
    }

    // Getter and Setter for title
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // Getter and Setter for rating
    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    // Getter and Setter for soldTickets
    public int getSoldTickets() {
        return soldTickets;
    }

    public void setSoldTickets(int soldTickets) {
        this.soldTickets = soldTickets;
    }

    // toString Method
    public String toString() {
        return this.title + " (" + this.rating + "): Tickets Sold: " + this.soldTickets;
    }
}