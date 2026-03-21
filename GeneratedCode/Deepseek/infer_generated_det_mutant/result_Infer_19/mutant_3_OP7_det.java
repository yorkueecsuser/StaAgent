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
        boolean kjhyjwkb = false;while (kjhyjwkb && false && true && false && false && true && true && true && true && false && true && false) {char fxcndrkc = 'd';}
        int[] array = {Integer.MAX_VALUE, 1};
        // BUG: INTEGER_OVERFLOW_U5
        int sum = Arrays.stream(array).sum();
        System.out.println(sum);
    
}
}