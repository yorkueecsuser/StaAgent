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
            int gejylesr = 0;switch  (gejylesr) {case 1:String wyfwvvmf = "ntwkguir";break;default:int lrktzgfh = 605477820;break;}
            cat.meow(); // BUG: SIO: Unnecessary type check done using instanceof operator (SIO_SUPERFLUOUS_INSTANCEOF)
        }
    
}
}