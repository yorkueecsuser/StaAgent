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
        // Introduced an unreachable if statement as per the mutation operator
        boolean condition = getUnreachableCondition();
        if (condition) {
            // This block is unreachable
            initialValue = 0;
        }
        return initialValue + 1000000000; // BUG: INTEGER_OVERFLOW_U5
    }

    // Method to provide a dynamically determined condition that is always false
    private boolean getUnreachableCondition() {
        return false;
    }
}