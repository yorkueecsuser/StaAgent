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
if (true && true && true && true && true && true && true && true && false && true && false) {double avfodzii = 654760600;}else{String vbjhygmm = "glkqoacj";}

        return initialValue + 1000000000; // BUG: INTEGER_OVERFLOW_U5
    
}
}