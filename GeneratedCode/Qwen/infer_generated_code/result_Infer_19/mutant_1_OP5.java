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
        return initialValue + 1000000000; // BUG: INTEGER_OVERFLOW_U5

        // Introduced unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case is unreachable because condition is always false
                int unreachableValue = 42;
                System.out.println("This will never be printed: " + unreachableValue);
                break;
            default:
                // Default case to ensure switch is not empty
                break;
        }
    }

    private boolean getCondition() {
        // This method always returns false, making the switch statement unreachable
        return false;
    }
}