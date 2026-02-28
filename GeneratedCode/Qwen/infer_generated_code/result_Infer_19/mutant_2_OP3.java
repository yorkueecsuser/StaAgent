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
            // This is an unreachable if statement because getCondition() will never return true
            System.out.println("This will never be printed");
        }
        return initialValue + 1000000000; // BUG: INTEGER_OVERFLOW_U5
    }

    private boolean getCondition() {
        // This method is designed to always return false, making the if statement unreachable
        return false;
    }
}