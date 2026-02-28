class MethodExceptionExample {

    /**
     * Demonstrates a method that throws an IllegalArgumentException if the input is invalid.
     */
    public int divide(int numerator, int denominator) {
        boolean unreachableCondition = getCondition(); // Mutation: Unreachable while loop condition
        while (unreachableCondition) { // Unreachable while loop
            // This block will never be executed
            System.out.println("This is an unreachable while loop.");
        }

        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero."); // BUG: Calls to methods should not trigger an exception
        }
        return numerator / denominator;
    }

    /**
     * Public method to demonstrate the bug by passing an invalid denominator.
     */
    public int showBug(int numerator, int denominator) {
        // This will throw an IllegalArgumentException if denominator is zero
        return divide(numerator, denominator); // BUG: Calls to methods should not trigger an exception
    }

    public static void main(String[] args) {
        MethodExceptionExample example = new MethodExceptionExample();
        try {
            // This call will demonstrate the bug by passing 0 as the denominator
            example.showBug(10, 0);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    // Helper method to ensure the condition is dynamically determined
    private boolean getCondition() {
        return false; // Always returns false, making the while loop unreachable at runtime
    }
}