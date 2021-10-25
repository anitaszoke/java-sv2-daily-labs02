package day05;

public class Movie {
    private String title;
    private int year;
    private double stars;
    private int howManyStars;
    private int allStars;

    public Movie(String title, int year) {
        this.title=title;
        this.year=year;

    }
    public double rateMovie (int rating){
        allStars = allStars +1;
        howManyStars = howManyStars + rating;
        stars = (howManyStars * 1.0) / allStars;
        return stars;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public double getStars() {
        return stars;
    }
}
