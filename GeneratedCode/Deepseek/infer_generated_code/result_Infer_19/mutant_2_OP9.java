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
        int sum = 0;
        int i = 0;
        do {
            sum += array[i];
            i++;
        } while (i < array.length);
        System.out.println(sum);
    }

    @ThreadSafe
    @ThreadConfined(ThreadConfined.ANY)
    @Expensive
    @PerformanceCritical
    public void showBug() {
        int[] array = {Integer.MAX_VALUE, 1};
        // BUG: INTEGER_OVERFLOW_U5
        int sum = 0;
        int i = 0;
        do {
            sum += array[i];
            i++;
        } while (i < array.length);
        System.out.println(sum);
    }
}