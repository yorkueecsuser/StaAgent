class InfiniteRecursionExample {

    // Entry point to demonstrate the bug
    public void showBug() {
        try {
            recursiveMethod();
        } catch (StackOverflowError e) {
            System.out.println("Caught StackOverflowError: " + e.getMessage());
        }
    }

    // Recursive method without a base case, leading to infinite recursion
    private void recursiveMethod() {
        boolean conditionWhile = getCondition(); // Mutant: introducing unreachable while loop
        while (conditionWhile) {
            // This block will never execute
            System.out.println("This is an unreachable while loop.");
        }
        recursiveMethod(); // BUG: Recursion should not be infinite
    }

    // Helper method to provide dynamic condition for unreachable code
    private boolean getCondition() {
        return false; // Ensures the while loop is unreachable
    }

    // Main method to execute the demonstration
    public static void main(String[] args) {
        InfiniteRecursionExample example = new InfiniteRecursionExample();
        example.showBug();
    }
}