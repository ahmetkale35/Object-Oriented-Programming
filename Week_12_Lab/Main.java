package week12;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList<Movie> list = new ArrayList<>();
        list.add(new Movie("Lord of the Rings: The Return of the King", 9.0, 2003));
        list.add(new Movie("Gladiator", 8.5, 2000));
        list.add(new Movie("Django Unchained", 8.5, 2012));
        list.add(new Movie("The Revenant", 8.0, 2015));
        list.add(new Movie("Dead Poets Society", 8.1, 1989));

        Collections.sort(list);

        System.out.println("Sorted by year:\n");
        for (Movie m: list)
            System.out.println(m);

        list.sort(new RatingCompare());

        System.out.println("Sorted by rating:\n");

        for (Movie m: list)
            System.out.println(m);

        System.out.println("Sorted by name:\n");

        list.sort(new NameCompare());

        for (Movie m: list)
            System.out.println(m);
    }
}
