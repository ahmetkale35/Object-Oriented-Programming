
public class Main {
    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.move();

        Cat cat = new Cat();
        cat.swim();
        cat.swim(3);

        Eagle eagle = new Eagle();
        eagle.move();
    }
}