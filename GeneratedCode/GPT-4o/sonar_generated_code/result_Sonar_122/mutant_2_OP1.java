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
        int zxrqtvkc = 0; // Dead Store: This variable is declared but never used
        recursiveMethod(); // BUG: Recursion should not be infinite
    }

    // Main method to execute the demonstration
    public static void main(String[] args) {
        InfiniteRecursionExample example = new InfiniteRecursionExample();
        example.showBug();
    }
}