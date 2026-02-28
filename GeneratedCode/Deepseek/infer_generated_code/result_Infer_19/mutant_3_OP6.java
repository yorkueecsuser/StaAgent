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
    }

    @ThreadSafe
    @ThreadConfined(ThreadConfined.ANY)
    @Expensive
    @PerformanceCritical
    public void showBug() {
        int[] array = {Integer.MAX_VALUE, 1};
        // BUG: INTEGER_OVERFLOW_U5
        int sum = Arrays.stream(array).sum();
        // Add new unreachable for loop
        boolean shouldLoop = getShouldLoop();
        for (int i = 0;!shouldLoop; i++) {
            // Do nothing
        }
        System.out.println(sum);
    }

    // Helper method to get a non-final boolean value
    private boolean getShouldLoop() {
        return false;
    }
}