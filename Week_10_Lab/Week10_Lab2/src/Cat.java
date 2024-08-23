class Cat implements Swimmable {
    public boolean isAnAnimal() {
        return true;
    }

    public void swim() {
        System.out.println("Cat is swimming.");
    }

    public void swim(int times) {
        for (int i = 0; i < times; i++) {
            swim();
        }
    }
}
