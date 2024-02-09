package A3;

// Define the class Movie
public class Movie {

    // Private instance variables to store movie title, genre, and rating
    private String filmTitle;  // Stores the title of the movie
    private String filmGenre;  // Stores the genre of the movie
    private int filmRating;    // Stores the rating of the movie

    // Default constructor initializes instance variables with default values
    Movie() {
        this.filmTitle = "Unknown Title";   // Default movie title
        this.filmGenre = "Undefined Genre";  // Default movie genre
        this.filmRating = 0;                 // Default movie rating
    }

    // Parameterized constructor initializes instance variables with provided values
    Movie(String title, String genre, int rating) {
        this.filmTitle = title;   // Set movie title to provided title
        this.filmGenre = genre;   // Set movie genre to provided genre
        this.filmRating = rating; // Set movie rating to provided rating
    }

    // Getter method to retrieve the genre of the movie
    public String getGenre() {
        return filmGenre;  // Return the genre of the movie
    }

    // Getter method to retrieve the rating of the movie
    public int getRating() {
        return filmRating;  // Return the rating of the movie
    }

    // Getter method to retrieve the title of the movie
    public String getTitle() {
        return filmTitle;  // Return the title of the movie
    }

    // Setter method to update the genre of the movie
    public void setGenre(String genre) {
        this.filmGenre = genre;  // Update the genre of the movie
    }

    // Setter method to update the rating of the movie
    public void setRating(int rating) {
        this.filmRating = rating;  // Update the rating of the movie
    }

    // Setter method to update the title of the movie
    public void setTitle(String title) {
        this.filmTitle = title;  // Update the title of the movie
    }

    // Method to play the movie
    public void watch() {
        System.out.println(this.filmTitle + " - Now playing");  // Print that the movie is now playing
    }

    // Override the toString() method to provide a string representation of the object
    @Override
    public String toString(){
        // Return a string representation containing the title, genre, and rating of the movie
        return "Title: " + this.filmTitle + ", Genre: " + this.filmGenre + ", Rating: " + this.filmRating;
    }

}
