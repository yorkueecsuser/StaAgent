class NonStaticInitializerExample {

    // Non-static initializer block
    {
        System.out.println("I am about to construct myself"); // BUG: NonStaticInitializer
    }

    public NonStaticInitializerExample() {
        System.out.println("Constructor called");
        
        // Inserted unreachable switch statement
        int unreachableSwitchValue = getUnreachableValue();
        switch (unreachableSwitchValue) {
            case 1:
                System.out.println("This is unreachable because `getUnreachableValue()` never returns 1.");
                break;
            default:
                // Default case to ensure switch is handled
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

    // Method that returns a value ensuring the switch statement is unreachable
    private int getUnreachableValue() {
        return 0; // The value that doesn't match any case in the switch
    }
}