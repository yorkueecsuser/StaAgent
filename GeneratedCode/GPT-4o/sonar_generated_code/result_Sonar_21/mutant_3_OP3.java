class MethodExceptionExample {

    /**
     * Demonstrates a method that throws an IllegalArgumentException if the input is invalid.
     */
    public int divide(int numerator, int denominator) {
        boolean unreachableCondition = getFalseCondition(); // This ensures the condition is evaluated at runtime
        if (unreachableCondition) {
            System.out.println("This statement is unreachable.");
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
        boolean unreachableCondition = getFalseCondition(); // This ensures the condition is evaluated at runtime
        if (unreachableCondition) {
            System.out.println("This statement is unreachable.");
        }
        // This will throw an IllegalArgumentException if denominator is zero
        return divide(numerator, denominator); // BUG: Calls to methods should not trigger an exception
    }

    private boolean getFalseCondition() {
        return false; // This method always returns false, making the if conditions unreachable
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
}