class Movie {

    String title;
    String genre;
    int rating;

    void playIt() {
        System.out.println("Playing the movie");
    }
}

public class MovieTestDrive {

    public static void main(String[] args) {

        Movie movie1 = new Movie();
        movie1.title = "Se7en";
        movie1.genre = "Mystery/Thriller";
        movie1.rating = 8;

        Movie movie2 = new Movie();
        movie2.title = "The Hangover";
        movie2.genre = "Comedy";
        movie2.rating = 7;

        movie2.playIt();
    }

}
