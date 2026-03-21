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
    animal = createAnimal(true);
    if(animal instanceof Cat){ Cat cat =(Cat)animal; cat.meow(); }
}
}