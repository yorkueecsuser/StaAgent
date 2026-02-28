class NonStaticInitializerExample {

    // Non-static initializer block
    {
        System.out.println("I am about to construct myself"); // BUG: NonStaticInitializer
    }

    public NonStaticInitializerExample() {
        System.out.println("Constructor called");
        
        // Introducing an unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            System.out.println("This is unreachable");
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
    
    // Method to ensure the condition is non-final and dynamic
    private boolean getCondition() {
        return false;
    }
}