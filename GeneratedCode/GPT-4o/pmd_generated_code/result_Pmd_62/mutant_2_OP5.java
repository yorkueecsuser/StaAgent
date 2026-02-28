class NonStaticInitializerExample {

    // Non-static initializer block
    {
        System.out.println("I am about to construct myself"); // BUG: NonStaticInitializer
    }

    public NonStaticInitializerExample() {
        System.out.println("Constructor called");
        
        // Adding unreachable switch statement
        int unreachableCondition = getUnreachableValue(); // Ensure this is non-final to avoid unreachable error
        switch (unreachableCondition) {
            case 999: // Arbitrary non-matching case
                System.out.println("This block is unreachable");
                break;
            default:
                // Default case is empty, ensuring the switch is structurally valid
                break;
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

    // Method to ensure the switch statement is not a compile-time constant
    private int getUnreachableValue() {
        return 0; // Return a value that does not match the case statement
    }
}