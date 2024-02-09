package A3;

public class Movie {

    private String filmTitle;
    private String filmGenre;
    private int filmRating;

    Movie() {
        this.filmTitle = "Unknown Title";
        this.filmGenre = "Undefined Genre";
        this.filmRating = 0;
    }

    Movie(String title, String genre, int rating) {
        this.filmTitle = title;
        this.filmGenre = genre;
        this.filmRating = rating;
    }

    public String getGenre() {
        return filmGenre;
    }

    public int getRating() {
        return filmRating;
    }

    public String getTitle() {
        return filmTitle;
    }

    public void setGenre(String genre) {
        this.filmGenre = genre;
    }

    public void setRating(int rating) {
        this.filmRating = rating;
    }

    public void setTitle(String title) {
        this.filmTitle = title;
    }

    public void watch() {
        System.out.println(this.filmTitle + " - Now playing");
    }

    @Override
    public String toString(){
        return "Title: " + this.filmTitle + ", Genre: " + this.filmGenre + ", Rating: " + this.filmRating;
    }

}
