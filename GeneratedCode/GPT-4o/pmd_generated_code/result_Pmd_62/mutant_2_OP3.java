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
        
        // Unreachable if statement mutation
        boolean condition = determineCondition(); // A method to ensure condition is determined at runtime
        if (condition) {
            System.out.println("This branch is unreachable due to condition being false.");
        }
        
        return "Check console output for bug demonstration.";
    }

    public static boolean determineCondition() {
        // Always returns false, but it's not a compile-time constant
        return false;
    }

    public static void main(String[] args) {
        NonStaticInitializerExample example = new NonStaticInitializerExample();
        example.showBug();
    }
}