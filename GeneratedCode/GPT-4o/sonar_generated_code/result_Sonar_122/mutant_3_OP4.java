class InfiniteRecursionExample {

    // Entry point to demonstrate the bug
    public void showBug() {
        try {
            recursiveMethod();
        } catch (StackOverflowError e) {
            System.out.println("Caught StackOverflowError: " + e.getMessage());
        }
        
        // Adding an unreachable if-else statement mutation
        boolean dynamicCondition = determineCondition();
        if (dynamicCondition) {
            System.out.println("This code block is not reachable.");
        } else {
            System.out.println("This code block is not reachable either.");
        }
    }

    // Recursive method without a base case, leading to infinite recursion
    private void recursiveMethod() {
        recursiveMethod(); // BUG: Recursion should not be infinite
    }
    
    // Method to dynamically determine condition for unreachable if-else statement
    private boolean determineCondition() {
        return false;
    }

    // Main method to execute the demonstration
    public static void main(String[] args) {
        InfiniteRecursionExample example = new InfiniteRecursionExample();
        example.showBug();
    }
}