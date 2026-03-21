class BuggyCode {
    static class Animal { }
    static class Cat extends Animal {
        void meow() {
            System.out.println("Meow");
        }
    }

    public Animal createAnimal(boolean createCat) {
        if (createCat)
            return new Cat();
        else
            return new Animal();
    }

    public void showBug() {
        Animal animal = createAnimal(true);
        if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            for  (int ftcttxdc = 0; ftcttxdc < 0; ftcttxdc++) {char etjdmdcn = 'k';}
            cat.meow(); // BUG: SIO: Unnecessary type check done using instanceof operator (SIO_SUPERFLUOUS_INSTANCEOF)
        }
    
}
}