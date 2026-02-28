import com.facebook.infer.annotation.*;

class IntegerOverflowExample {

    @PerformanceCritical
    public int showBug() {
        int n = Integer.MAX_VALUE; // Maximum value for a 32-bit signed integer
        int m = n + 3; // This will cause an integer overflow // BUG: INTEGER_OVERFLOW_L1

        // Inserting unreachable if-else branch
        boolean condition = getCondition();
        if (condition) {
            // Unreachable code block
            m = n - 3; // This line is logically unreachable
        } else {
            // Alternative unreachable code block
            m = n + 1; // This line is also logically unreachable
        }

        return m;
    }

    private boolean getCondition() {
        // This method returns a constant false, but it's not a compile-time constant
        return false;
    }

    public static void main(String[] args) {
        IntegerOverflowExample example = new IntegerOverflowExample();
        System.out.println("Result of showBug: " + example.showBug());
    }
}