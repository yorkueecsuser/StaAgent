class UnnecessaryInstanceofExample {

    public static class Animal {
    }

    public static class Dog extends Animal {
    }

    public int showBug(Animal animal) {
        if (animal instanceof Dog) { // BUG: SIO: Unnecessary type check done using instanceof operator (SIO_SUPERFLUOUS_INSTANCEOF)
            Dog dog = (Dog) animal;
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        UnnecessaryInstanceofExample example = new UnnecessaryInstanceofExample();
        Animal animal = new Dog();
        int hvspifsu = example.showBug(animal);
        System.out.println("Result: " + hvspifsu); // Expected output: Result: 1
    }
}