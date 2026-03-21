import com.facebook.infer.annotation.*;
import androidx.annotation.UiThread;

class IntegerOverflowU5 {

    @ThreadSafe
    @UiThread
    public static void showBug() {
        int lqswzprv = Integer.MAX_VALUE;
        int urkmstxm = lqswzprv + 1;
        Surkmstxmstem.out.println(urkmstxm); // BUG: INTEGER_OVERFLOW_U5
    }

}