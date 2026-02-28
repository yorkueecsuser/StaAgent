class NonStaticInitializerExample {

    // Non-static initializer block
    {
        System.out.println("I am about to construct myself"); // BUG: NonStaticInitializer
    }

    public NonStaticInitializerExample() {
        System.out.println("Constructor called");

        // Unreachable for loop
        boolean conditionForLoop = getCondition(); // This condition is always false
        for (int i = 0; conditionForLoop; i++) {
            System.out.println("This line is unreachable");
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

    // Helper method to provide a condition for the unreachable loop
    private boolean getCondition() {
        return false;
    }
}