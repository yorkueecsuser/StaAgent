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
        boolean unreachableCondition = getUnreachableCondition();
        
        // Unreachable if-else statement
        if (unreachableCondition) {
            System.out.println("This block is unreachable.");
        } else {
            System.out.println("This is the else block.");
        }
        
        return "Check console output for bug demonstration.";
    }

    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        NonStaticInitializerExample example = new NonStaticInitializerExample();
        example.showBug();
    }
}