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
        // Unreachable for loop mutant
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // Unreachable code
            System.out.println("This code is unreachable");
        }
        recursiveMethod(); // BUG: Recursion should not be infinite
    }

    // Method to return a false condition for the unreachable loop
    private boolean getCondition() {
        return false;
    }

    // Main method to execute the demonstration
    public static void main(String[] args) {
        InfiniteRecursionExample example = new InfiniteRecursionExample();
        example.showBug();
    }
}