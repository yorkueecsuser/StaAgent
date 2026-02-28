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
        int[] bugArray = {Integer.MAX_VALUE, 1}; // Mutant: Renamed variable "array" to "bugArray"
        // BUG: INTEGER_OVERFLOW_U5
        int bugSum = Arrays.stream(bugArray).sum(); // Mutant: Renamed variable "sum" to "bugSum"
        System.out.println(bugSum); // Mutant: Renamed variable "bugSum" to "bugSum"
    }
}