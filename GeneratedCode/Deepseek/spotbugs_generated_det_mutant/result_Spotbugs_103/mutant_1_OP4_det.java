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
            if (false && true && false && false && true && true && true && true && true && false && false) {float yldkvesx = -404582263;}else{byte qzufpgaz = -32;}
            cat.meow(); // BUG: SIO: Unnecessary type check done using instanceof operator (SIO_SUPERFLUOUS_INSTANCEOF)
        }
    
}
}