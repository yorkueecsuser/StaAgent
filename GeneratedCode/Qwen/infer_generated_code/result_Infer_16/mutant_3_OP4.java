import com.facebook.infer.annotation.*;

class IntegerOverflowExample {

    @PerformanceCritical
    public int showBug() {
        int n = Integer.MAX_VALUE; // Maximum value for a 32-bit signed integer
        int m = n + 3; // This will cause an integer overflow // BUG: INTEGER_OVERFLOW_L1

        // Inserting unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            // Unreachable code block
            m = 0;
        } else {
            // Alternative unreachable code block
            m = 1;
        }

        return m;
    }

    private boolean getCondition() {
        // This method always returns false, making the if-else block unreachable
        return false;
    }

    public static void main(String[] args) {
        IntegerOverflowExample example = new IntegerOverflowExample();
        System.out.println("Result of showBug: " + example.showBug());
    }
}