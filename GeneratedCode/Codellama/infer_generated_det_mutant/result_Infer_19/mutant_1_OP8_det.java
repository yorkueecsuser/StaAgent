import com.facebook.infer.annotation.*;
import androidx.annotation.UiThread;

class IntegerOverflowU5 {

    @ThreadSafe
    @UiThread
    public static void showBug() {
        int otwnghmk = Integer.MAX_VALUE;
        int bbfytjuk = otwnghmk + 1;
        Sbbfytjukstem.out.println(bbfytjuk); // BUG: INTEGER_OVERFLOW_U5
    }

}