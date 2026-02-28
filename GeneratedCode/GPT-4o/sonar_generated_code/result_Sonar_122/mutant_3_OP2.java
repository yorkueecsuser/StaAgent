class InfiniteRecursionExample {

    // Entry point to demonstrate the bug
    public void showBug() {
        try {
            recursiveMethod();
        } catch (StackOverflowError e) {
            System.out.println("Caught StackOverflowError: " + e.getMessage());
            System.out.println("Caught StackOverflowError: " + e.getMessage()); // Duplicated assignment statement
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
    }
}