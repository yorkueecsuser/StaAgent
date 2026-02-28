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
        boolean condition = getCondition();
        if (condition) {
            // This block is unreachable because getCondition() always returns false
            initialValue = initialValue - 1000000000;
        }
        return initialValue + 1000000000; // BUG: INTEGER_OVERFLOW_U5
    }

    private boolean getCondition() {
        // Always return false to ensure the if block is unreachable
        return false;
    }
}