class MethodExceptionExample {

    /**
     * Demonstrates a method that throws an IllegalArgumentException if the input is invalid.
     */
    public int divide(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero."); // BUG: Calls to methods should not trigger an exception
        }

        // Insert an unreachable if statement
        boolean condition = getUnreachableCondition();
        if (condition) {
            System.out.println("This line is unreachable.");
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

    // Method to ensure the condition is dynamically determined at runtime
    private boolean getUnreachableCondition() {
        return false;
    }
}