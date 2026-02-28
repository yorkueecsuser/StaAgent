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
        // Introducing an unreachable switch statement
        boolean alwaysFalse = getAlwaysFalse();
        switch (alwaysFalse) {
            case true:
                // This case is unreachable because alwaysFalse is always false
                initialValue = 0;
                break;
            default:
                // Default case to ensure the switch is not empty and always reachable
                break;
        }

        return initialValue + 1000000000; // BUG: INTEGER_OVERFLOW_U5
    }

    private boolean getAlwaysFalse() {
        return false;
    }
}