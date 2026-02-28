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
        boolean condition = getFalseCondition(); // Introduce unreachable if branch
        if (condition) {
            // This block will never be executed
            System.out.println("This is an unreachable statement.");
        }
        recursiveMethod(); // BUG: Recursion should not be infinite
    }

    // Method added to create a false condition dynamically
    private boolean getFalseCondition() {
        return false;
    }

    // Main method to execute the demonstration
    public static void main(String[] args) {
        InfiniteRecursionExample example = new InfiniteRecursionExample();
        example.showBug();
    }
}