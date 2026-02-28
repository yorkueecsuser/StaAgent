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
        boolean alwaysFalse = getCondition(); // Using a method to ensure runtime evaluation
        if (alwaysFalse) {
            System.out.println("This will never be printed.");
        } else {
            recursiveMethod(); // BUG: Recursion should not be infinite
        }
    }

    // A method to simulate a condition that is always false at runtime
    private boolean getCondition() {
        return false;
    }

    // Main method to execute the demonstration
    public static void main(String[] args) {
        InfiniteRecursionExample example = new InfiniteRecursionExample();
        example.showBug();
    }
}