package A3;

// Import the Scanner class from the java.util package
import java.util.Scanner;

// Define the class MovieTester
public class MovieTester {

    // Main method, entry point of the program
    public static void main(String[] args) {

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Create an array to store Movie objects
        Movie[] movieList = new Movie[3];

        // Loop to create Movie objects and store them in the array
        for(int i=0; i < movieList.length; i++) {
            Movie movie = new Movie();  // Create a new Movie object
            movieList[i] = movie;       // Store the Movie object in the array
        }

        // Loop to get user input for movie titles, genres, and ratings
        for(int i=0; i < movieList.length; i++) {
            System.out.println("Enter title of movie " + (i+1));  // Prompt user to enter movie title
            String title = scanner.nextLine();                    // Read the movie title
            System.out.println("Enter genre of movie " + (i+1));  // Prompt user to enter movie genre
            String genre = scanner.nextLine();                    // Read the movie genre
            System.out.println("Score the movie between 1 and 10");  // Prompt user to score the movie
            int rating = Integer.parseInt(scanner.nextLine());       // Read the movie rating
            // Set the title, genre, and rating of the Movie object in the array
            movieList[i].setTitle(title);
            movieList[i].setGenre(genre);
            movieList[i].setRating(rating);
        }

        // Loop to display movie details and play each movie
        for(int i=0; i < movieList.length; i++) {
            System.out.println("---------- Movie " + (i + 1) + " ----------");
            System.out.println("Movie Title: " + movieList[i].getTitle());  // Display movie title
            System.out.println("Movie Genre: " + movieList[i].getGenre());  // Display movie genre
            System.out.println("Movie Rating: " + movieList[i].getRating());  // Display movie rating
            movieList[i].watch();  // Play the movie
        }

        // Close the scanner to release system resources
        scanner.close();

    }

}
