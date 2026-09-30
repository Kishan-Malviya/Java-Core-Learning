package topic01_variables_and_datatypes;

/** Write a program to -
 * Create a variable to store the name of a movie.
 * Create a variable to store its release year.
 * Create a variable to store its IMDb rating (out of 10).
 * 1. Print a sentence combining them, like: "The movie Inception was released in 2010 and has a rating of 8.8."
 * */

public class VariableChallenge {
    public static void main(String[] args) {
        String movieName = "Inception";
        int releaseYear = 2010;
        float imdbRating = 8.8f;
        System.out.println("The movie " + movieName + " was released in " + releaseYear + " and has a rating of " + imdbRating + ".");
    }
}
