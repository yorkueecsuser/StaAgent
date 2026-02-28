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
        int y = 0;
        do {
            y = x + 1;
            x++;
        } while (y!= Integer.MAX_VALUE);
        System.out.println(y);
    }

}