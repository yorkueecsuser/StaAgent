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

        // Mutant code with renamed variable
        int x = initialValue;
        return x + 1000000000; // Mutant: Renamed 'initialValue' to 'x'
    }
}