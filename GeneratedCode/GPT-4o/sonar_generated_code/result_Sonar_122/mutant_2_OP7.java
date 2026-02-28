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
        recursiveMethod(); // BUG: Recursion should not be infinite
    }
    
    // Main method to execute the demonstration
    public static void main(String[] args) {
        InfiniteRecursionExample example = new InfiniteRecursionExample();
        example.showBug();

        // Introducing a non-final variable for the unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            System.out.println("This line will never execute.");
        }
    }

    // Method to simulate a condition check for the while loop
    private static boolean getCondition() {
        return false; // Always false to make the while loop unreachable
    }
}