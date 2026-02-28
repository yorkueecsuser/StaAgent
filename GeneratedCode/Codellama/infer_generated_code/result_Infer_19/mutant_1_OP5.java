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
    public static void showMutant() {
        int x = Integer.MAX_VALUE;
        int y = x + 1;
        boolean condition = false;
        if (condition) {
            System.out.println(y); // BUG: INTEGER_OVERFLOW_U5
        } else {
            System.out.println("Unreachable code");
        }
    }
}