class MethodExceptionExample {

    /**
     * Demonstrates a method that throws an IllegalArgumentException if the input is invalid.
     */
    public int divide(int numerator, int denominator) {
        boolean conditionFor = getCondition();  // non-final variable used for the loop
        for (int i = 0; conditionFor; i++) {
            // This code is unreachable because conditionFor is false by default
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
        boolean conditionFor = getCondition();  // non-final variable used for the loop
        for (int i = 0; conditionFor; i++) {
            // This code is unreachable because conditionFor is false by default
        }
        // This will throw an IllegalArgumentException if denominator is zero
        return divide(numerator, denominator); // BUG: Calls to methods should not trigger an exception
    }

    public static void main(String[] args) {
        MethodExceptionExample example = new MethodExceptionExample();
        try {
            boolean conditionFor = example.getCondition();  // non-final variable used for the loop
            for (int i = 0; conditionFor; i++) {
                // This code is unreachable because conditionFor is false by default
            }
            // This call will demonstrate the bug by passing 0 as the denominator
            example.showBug(10, 0);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    public boolean getCondition() {
        return false;  // Method used to ensure the loop condition is not a compile-time constant
    }
}