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
        
        // Introducing an unreachable if statement
        boolean falseCondition = calculateCondition();
        if (falseCondition) {
            System.out.println("This block is unreachable");
        }

        return "Check console output for bug demonstration.";
    }

    // Method to ensure the condition is dynamic and doesn't lead to an unreachable statement error
    private boolean calculateCondition() {
        return false;
    }

    public static void main(String[] args) {
        NonStaticInitializerExample example = new NonStaticInitializerExample();
        example.showBug();
    }
}