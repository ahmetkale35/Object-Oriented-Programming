package week12;

public class Movie implements Comparable <Movie> {
    private double rating;
    private String name;
    private int year;

    Movie(String name, double rating, int year) {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }

    public double getRating() { return rating; }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    @Override
    public int compareTo(Movie o) {
        return year - o.year;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nRate: " + rating + "\nYear: " + year
                + "\n*****************************";
    }
}
