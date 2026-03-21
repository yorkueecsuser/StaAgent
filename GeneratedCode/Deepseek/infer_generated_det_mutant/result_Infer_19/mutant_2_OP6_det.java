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
        for  (int hcxzyfhq = 0; hcxzyfhq < 0; hcxzyfhq++) {short fprgypnm = 951;}
        System.out.println(sum);
    
}
}