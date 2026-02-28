import com.facebook.infer.annotation.*;

class IntegerOverflowExample {

    @PerformanceCritical
    public int showBug() {
        int n = Integer.MAX_VALUE; // Maximum value for a 32-bit signed integer
        int m = n + 3; // This will cause an integer overflow // BUG: INTEGER_OVERFLOW_L1

        // Introduced unreachable while loop as per mutation operator
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code block
            m = m - 1; // Example operation within the unreachable loop
        }

        return m;
    }

    // Method to provide a dynamic condition for the while loop
    private boolean getCondition() {
        return false; // This method always returns false, making the while loop unreachable
    }

    public static void main(String[] args) {
        IntegerOverflowExample example = new IntegerOverflowExample();
        System.out.println("Result of showBug: " + example.showBug());
    }
}