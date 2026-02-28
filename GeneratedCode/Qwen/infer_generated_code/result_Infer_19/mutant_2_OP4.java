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
            // This block is unreachable because getCondition() will always return false
            initialValue += 1;
        } else {
            // This is the normal execution path
            return initialValue + 1000000000; // BUG: INTEGER_OVERFLOW_U5
        }
        return initialValue; // This line ensures there's no unreachable statement error
    }

    private boolean getCondition() {
        // Always returns false, making the if-block unreachable
        return false;
    }
}