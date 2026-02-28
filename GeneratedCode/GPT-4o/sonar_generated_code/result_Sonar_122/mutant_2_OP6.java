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
        // Inserting unreachable for loop
        boolean conditionFor = getFalseCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This line is unreachable.");
        }

        recursiveMethod(); // BUG: Recursion should not be infinite
    }

    // Main method to execute the demonstration
    public static void main(String[] args) {
        InfiniteRecursionExample example = new InfiniteRecursionExample();
        example.showBug();
    }

    // Method to provide a runtime false condition
    private boolean getFalseCondition() {
        return false;
    }
}