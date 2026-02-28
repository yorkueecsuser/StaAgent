import com.facebook.infer.annotation.*;
import androidx.annotation.UiThread;

class IntegerOverflowU5 {

    @ThreadSafe
    @UiThread
    public static void showBug() {
        int x = Integer.MAX_VALUE;
        int y = x + 1;
        System.out.println(y); // BUG: INTEGER_OVERFLOW_U5

        // Unreachable if-else statement mutation
        if (false) {
            System.out.println("Unreachable code");
        } else {
            System.out.println("This branch is always taken");
        }
    }

}