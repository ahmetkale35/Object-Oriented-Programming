abstract class Animal implements Moveable {
    abstract void fly();

    public void move() {
        fly();
    }
}
