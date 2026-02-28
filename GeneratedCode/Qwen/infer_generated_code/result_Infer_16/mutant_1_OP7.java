import com.facebook.infer.annotation.*;

class IntegerOverflowExample {

    @PerformanceCritical
    public int showBug() {
        int n = Integer.MAX_VALUE; // Maximum value for a 32-bit signed integer
        int m = n + 3; // This will cause an integer overflow // BUG: INTEGER_OVERFLOW_L1

        // Unreachable while loop mutant
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable because getCondition() always returns false
            System.out.println("This loop is unreachable");
        }

        return m;
    }

    private boolean getCondition() {
        // This method always returns false, making the while loop condition always false
        return false;
    }

    public static void main(String[] args) {
        IntegerOverflowExample example = new IntegerOverflowExample();
        System.out.println("Result of showBug: " + example.showBug());
    }
}