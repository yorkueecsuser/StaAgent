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

    // Added unreachable while loop
    private static boolean getCondition() {
        return false;
    }

    private static int getValue() {
        return 0;
    }
}