import com.facebook.infer.annotation.*;
import java.util.Arrays;

class IntegerOverflowU5 {
    @ThreadSafe
    @ThreadConfined(ThreadConfined.ANY)
    @Expensive
    @PerformanceCritical
    public static void main(String[] args) {
        int[] array = {Integer.MAX_VALUE, 1};
        // BUG: INTEGER_OVERFLOW_U5
        int sum = Arrays.stream(array).sum();
        System.out.println(sum);

        boolean condition = false;
        if (condition) {
            // empty block of code to make the switch unreachable
            System.out.println("Unreachable code");
        } else {
            // empty block of code to make the switch unreachable
            System.out.println("Unreachable code");
        }
    }

    @ThreadSafe
    @ThreadConfined(ThreadConfined.ANY)
    @Expensive
    @PerformanceCritical
    public void showBug() {
        int[] array = {Integer.MAX_VALUE, 1};
        // BUG: INTEGER_OVERFLOW_U5
        int sum = Arrays.stream(array).sum();
        System.out.println(sum);

        boolean condition = false;
        if (condition) {
            // empty block of code to make the switch unreachable
            System.out.println("Unreachable code");
        } else {
            // empty block of code to make the switch unreachable
            System.out.println("Unreachable code");
        }
    }
}