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

        // Adding an unreachable switch statement
        int switchCondition = getFalseConditionValue();
        switch(switchCondition) {
            case 1:
                System.out.println("This is case 1 which will never execute.");
                break;
            case 2:
                System.out.println("This is case 2 which will never execute.");
                break;
            default:
                // Default case - do nothing
                break;
        }
    }

    // Method to provide a value that results in an unreachable switch statement
    private static int getFalseConditionValue() {
        return 3; // This value is not handled in any case, making the cases unreachable
    }
}