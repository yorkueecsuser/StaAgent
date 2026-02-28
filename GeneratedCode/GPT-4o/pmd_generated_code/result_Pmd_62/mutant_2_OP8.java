class NonStaticInitializerExample {

    // Non-static initializer block
    {
        System.out.println("I am about to construct myself"); // BUG: NonStaticInitializer
    }

    public NonStaticInitializerExample() {
        System.out.println("Constructor called");
    }

    public String showBug() {
        NonStaticInitializerExample instance = new NonStaticInitializerExample();
        return "Check console output for bug demonstration.";
    }

    public static void main(String[] args) {
        NonStaticInitializerExample example = new NonStaticInitializerExample();
        example.showBug();
    }
}

// Mutant Code
class NonStaticInitializerExampleMutant1 {

    // Non-static initializer block
    {
        System.out.println("I am about to construct myself"); // BUG: NonStaticInitializer
    }

    public NonStaticInitializerExampleMutant1() {
        System.out.println("Constructor called");
    }

    public String showBug() {
        NonStaticInitializerExampleMutant1 b = new NonStaticInitializerExampleMutant1();
        return "Check console output for bug demonstration.";
    }

    public static void main(String[] args) {
        NonStaticInitializerExampleMutant1 c = new NonStaticInitializerExampleMutant1();
        c.showBug();
    }
}