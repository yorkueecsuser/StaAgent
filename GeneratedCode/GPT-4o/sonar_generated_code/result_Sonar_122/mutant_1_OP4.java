class InfiniteRecursionExample {

    // Entry point to demonstrate the bug
    public void showBug() {
        try {
            recursiveMethod();
        } catch (StackOverflowError e) {
            System.out.println("Caught StackOverflowError: " + e.getMessage());
        }
        
        // Inserting an unreachable if-else branch
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This will never be printed.");
        } else {
            System.out.println("This is the else branch.");
        }
    }

    // Recursive method without a base case, leading to infinite recursion
    private void recursiveMethod() {
        recursiveMethod(); // BUG: Recursion should not be infinite
    }
    
    // Method to ensure the condition is false at runtime
    private boolean getFalseCondition() {
        return false;
    }

    // Main method to execute the demonstration
    public static void main(String[] args) {
        InfiniteRecursionExample example = new InfiniteRecursionExample();
        example.showBug();
    }
}