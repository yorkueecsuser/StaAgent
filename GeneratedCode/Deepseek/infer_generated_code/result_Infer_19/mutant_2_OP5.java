import com.facebook.infer.annotation.*;
import java.util.Arrays;

class IntegerOverflowU5 {
    @ThreadSafe
    @ThreadConfined(ThreadConfined.ANY)
    @Expensive
    @PerformanceCritical
    public static void main(String[] args) {
        int[] array = {Integer.MAX_VALUE, 1};
        int sum;
        // BUG: INTEGER_OVERFLOW_U5
        try {
            sum = Arrays.stream(array).sum();
        } catch (Exception e) {
            sum = 0;
        }
        System.out.println(sum);

        // Mutant Code - Unreachable Switch Statement
        int mutantVariable = Integer.MIN_VALUE;
        switch (mutantVariable) {
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

        // Mutant Code - Unreachable Switch Statement
        int mutantVariable = Integer.MIN_VALUE;
        switch (mutantVariable) {
        }
    }
}