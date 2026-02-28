import com.facebook.infer.annotation.*;
import androidx.annotation.UiThread;

class IntegerOverflowU5 {

    @ThreadSafe
    @UiThread
    public static void showBug() {
        int x = Integer.MAX_VALUE;
        int y = x + 1;
        System.out.println(y); // BUG: INTEGER_OVERFLOW_U5
        for (int i = 0; false; i++) {
            // Unreachable code
            System.out.println("This code should not be executed.");
        }
    }

}