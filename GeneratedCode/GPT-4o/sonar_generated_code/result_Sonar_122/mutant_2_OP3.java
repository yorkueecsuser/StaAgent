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
        boolean reachUnreachableCode = getUnreachableCondition();
        if (reachUnreachableCode) {
            System.out.println("This message will never be printed.");
        }
        recursiveMethod(); // BUG: Recursion should not be infinite
    }

    private boolean getUnreachableCondition() {
        // This method always returns false
        return false;
    }

    // Main method to execute the demonstration
    public static void main(String[] args) {
        InfiniteRecursionExample example = new InfiniteRecursionExample();
        example.showBug();
    }
}