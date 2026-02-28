import com.facebook.infer.annotation.*;
import java.util.Arrays;

class IntegerOverflowU5 {
    @ThreadSafe
    @ThreadConfined(ThreadConfined.ANY)
    @Expensive
    @PerformanceCritical
    public static void main(String[] args) {
        int[] array = {Integer.MAX_VALUE, 1};
        int sum = Arrays.stream(array).sum();
        System.out.println(sum);
        // Mutant for INTEGER_OVERFLOW_U5 (Unreachable While Loop)
        boolean condition = getCondition();
        while (condition) {
            if (sum == Integer.MIN_VALUE) {
                sum = 0;
            }
        }
    }

    @ThreadSafe
    @ThreadConfined(ThreadConfined.ANY)
    @Expensive
    @PerformanceCritical
    public void showBug() {
        int[] array = {Integer.MAX_VALUE, 1};
        int sum = Arrays.stream(array).sum();
        System.out.println(sum);
        // Mutant for INTEGER_OVERFLOW_U5 (Unreachable While Loop)
        boolean condition = getCondition();
        while (condition) {
            if (sum == Integer.MIN_VALUE) {
                sum = 0;
            }
        }
    }
    
    public static boolean getCondition() {
        return false;
    }
}