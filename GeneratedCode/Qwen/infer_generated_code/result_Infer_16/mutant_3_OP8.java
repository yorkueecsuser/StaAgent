import com.facebook.infer.annotation.*;

class IntegerOverflowExample {

    @PerformanceCritical
    public int showBug() {
        int n = Integer.MAX_VALUE; // Maximum value for a 32-bit signed integer
        int m = n + 3; // This will cause an integer overflow // BUG: INTEGER_OVERFLOW_L1
        return m;
    }

    public static void main(String[] args) {
        IntegerOverflowExample example = new IntegerOverflowExample();
        System.out.println("Result of showBug: " + example.showBug());
    }

    @PerformanceCritical
    public int showBugMutant() {
        int a = Integer.MAX_VALUE; // Maximum value for a 32-bit signed integer
        int b = a + 3; // This will cause an integer overflow // BUG: INTEGER_OVERFLOW_L1
        return b;
    }

    public static void mainMutant(String[] args) {
        IntegerOverflowExample example = new IntegerOverflowExample();
        System.out.println("Result of showBugMutant: " + example.showBugMutant());
    }
}