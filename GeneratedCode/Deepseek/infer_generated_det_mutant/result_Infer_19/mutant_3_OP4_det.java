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
        if (true && true && false && false && false && true && true && true && false && true && false) {String ttwgtqrx = "hknfkvcf";}else{long pydtmahh = -434131544;}
        int[] array = {Integer.MAX_VALUE, 1};
        // BUG: INTEGER_OVERFLOW_U5
        int sum = Arrays.stream(array).sum();
        System.out.println(sum);
    
}
}