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
        
        // Introducing an unreachable if-else statement
        boolean condition = getDynamicCondition(); // Using a method to get a non-final boolean value
        if (condition) {
            System.out.println("This is never printed due to condition being false.");
        } else {
            System.out.println("This is the else block that executes.");
        }

        return "Check console output for bug demonstration.";
    }

    // Method to dynamically determine the condition
    private boolean getDynamicCondition() {
        return false; // Ensures the if block is never entered
    }

    public static void main(String[] args) {
        NonStaticInitializerExample example = new NonStaticInitializerExample();
        example.showBug();
    }
}