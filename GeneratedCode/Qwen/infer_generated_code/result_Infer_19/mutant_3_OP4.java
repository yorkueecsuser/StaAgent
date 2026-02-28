import com.facebook.infer.annotation.*;

class IntegerOverflowExample {

    /**
     * Demonstrates the INTEGER_OVERFLOW_U5 bug.
     * This method takes an integer input and adds a large number to it, causing an overflow.
     *
     * @param initialValue the initial integer value
     * @return the result of the addition, which will overflow if initialValue is sufficiently large
     */
    @PerformanceCritical
    public int showBug(int initialValue) {
        // Introduced an unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            // This block is unreachable because getCondition() always returns false
            initialValue = initialValue - 1000000000;
        } else {
            // This block is always executed
            initialValue = initialValue + 1000000000; // BUG: INTEGER_OVERFLOW_U5
        }
        return initialValue;
    }

    // Method to provide a dynamic condition that is always false
    private boolean getCondition() {
        return false;
    }
}