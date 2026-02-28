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
    
    @UiThread
    public static void showMutant() {
        int x = Integer.MAX_VALUE;
        int y = x + 1;
        if (false) {
            System.out.println("This is an unreachable statement");
        }
        System.out.println(y);
    }
}