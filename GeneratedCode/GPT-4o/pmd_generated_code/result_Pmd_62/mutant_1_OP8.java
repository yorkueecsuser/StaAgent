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

// Mutated version of the code with renaming applied
class NonStaticInitializerExampleMutant {

    // Non-static initializer block
    {
        System.out.println("I am about to construct myself");
    }

    public NonStaticInitializerExampleMutant() {
        System.out.println("Constructor called");
    }

    public String showBug() {
        NonStaticInitializerExampleMutant x = new NonStaticInitializerExampleMutant(); // Renamed variable
        return "Check console output for bug demonstration.";
    }

    public static void main(String[] args) {
        NonStaticInitializerExampleMutant example = new NonStaticInitializerExampleMutant();
        example.showBug();
    }
}