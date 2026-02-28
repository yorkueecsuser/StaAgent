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

        if (false) { // Unreachable if statement
            System.out.println("This is an unreachable statement");
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

        while (false) { // Unreachable while loop
            System.out.println("This is an unreachable statement");
        }
    }
}