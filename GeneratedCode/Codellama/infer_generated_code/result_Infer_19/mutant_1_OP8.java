import com.facebook.infer.annotation.*;
import androidx.annotation.UiThread;

class IntegerOverflowU5 {

    @ThreadSafe
    @UiThread
    public static void showBug() {
        int x = Integer.MAX_VALUE;
        int y = x + 1;
        System.out.println(y); // BUG: INTEGER_OVERFLOW_U5
    }

    @ThreadSafe
    @UiThread
    public static void showMutatedBug() {
        int x = Integer.MAX_VALUE;
        int z = x + 1; // Renamed variable y to z
        System.out.println(z); // BUG: INTEGER_OVERFLOW_U5
    }

}