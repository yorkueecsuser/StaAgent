import com.facebook.infer.annotation.*;
import androidx.annotation.UiThread;

class IntegerOverflowU5 {

    @ThreadSafe
    @UiThread
    public static void showBug() {
        int x = Integer.MAX_VALUE;
        int y = x + 1;

        // Unreachable while loop
        while (false) {
            // This loop is always false
            System.out.println("Unreachable code");
        }

        System.out.println(y); // BUG: INTEGER_OVERFLOW_U5
    }

}