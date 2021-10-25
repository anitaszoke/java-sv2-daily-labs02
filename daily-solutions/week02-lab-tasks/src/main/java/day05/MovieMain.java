package day05;

public class MovieMain {

    public static void main(String[] args) {
        Movie movie = new Movie("Az", 2018);

        System.out.println(movie.rateMovie(1));
        System.out.println(movie.rateMovie(3));
        System.out.println(movie.rateMovie(5));

        Viewer viewer = new Viewer();
        viewer.watchMovie(movie, 5);

        System.out.println(movie.getStars());


        }
    }
