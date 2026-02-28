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

        // Unreachable switch statement added as mutant
        int condition = getCondition(); // This method returns a value not equal to 1
        switch (condition) {
            case 1:
                System.out.println("This will never print.");
                break;
            default:
                // No operation needed
                break;
        }
    }

    private int getCondition() {
        return 0; // Always returns 0 making the switch statement unreachable
    }

    // Main method to execute the demonstration
    public static void main(String[] args) {
        InfiniteRecursionExample example = new InfiniteRecursionExample();
        example.showBug();
    }
}