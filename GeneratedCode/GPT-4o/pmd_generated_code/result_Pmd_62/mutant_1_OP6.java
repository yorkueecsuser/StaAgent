class NonStaticInitializerExample {

    // Non-static initializer block
    {
        System.out.println("I am about to construct myself"); // BUG: NonStaticInitializer
    }

    public NonStaticInitializerExample() {
        System.out.println("Constructor called");
        
        // Inserting an unreachable for loop
        boolean conditionFor = getCondition(); // A method to ensure the condition is not a compile-time constant
        for (int i = 0; conditionFor; i++) {
            System.out.println("This will never be printed because the condition is false.");
        }
    }

    public String showBug() {
        NonStaticInitializerExample instance = new NonStaticInitializerExample();
        return "Check console output for bug demonstration.";
    }

    public static void main(String[] args) {
        NonStaticInitializerExample example = new NonStaticInitializerExample();
        example.showBug();
    }
    
    // Method to provide a non-final variable condition
    private boolean getCondition() {
        // Always returns false to simulate unreachable code
        return false;
    }
}