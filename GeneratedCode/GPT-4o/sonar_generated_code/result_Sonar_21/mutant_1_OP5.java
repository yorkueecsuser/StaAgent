class MethodExceptionExample {

    /**
     * Demonstrates a method that throws an IllegalArgumentException if the input is invalid.
     */
    public int divide(int numerator, int denominator) {
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

        // Inserting unreachable switch statement
        int switchValue = getSwitchValue(); // This will always return a value not equal to 1
        switch (switchValue) {
            case 1:
                System.out.println("This is unreachable code.");
                break;
            default:
                // No operation
                break;
        }
    }

    // Helper method to ensure the switch statement is unreachable
    public static int getSwitchValue() {
        return 0; // Always returns 0 to ensure the switch case 1 is never reached
    }
}