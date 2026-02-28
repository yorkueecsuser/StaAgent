class NonStaticInitializerExample {

    // Non-static initializer block
    {
        System.out.println("I am about to construct myself"); // BUG: NonStaticInitializer
    }

    public NonStaticInitializerExample() {
        System.out.println("Constructor called");
        
        // Unreachable if-else branch added
        boolean condition = getFalseCondition(); // This method will return false
        if (condition) {
            System.out.println("This code will never execute.");
        } else {
            // The else branch is always executed, ensuring the code is not unreachable
            System.out.println("This is the always executed branch of the unreachable if-else.");
        }
    }

    public String showBug() {
        NonStaticInitializerExample instance = new NonStaticInitializerExample();
        return "Check console output for bug demonstration.";
    }

    // Method to provide a non-final false condition
    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        NonStaticInitializerExample example = new NonStaticInitializerExample();
        example.showBug();
    }
}